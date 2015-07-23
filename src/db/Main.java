package db;
import java.util.ArrayList;
import pojos.Prueba;

public class Main 
{
        public static void main(String[] args) 
        {
                //CONEXION:
                DB.conectar();
                
                
                //INSERCION SIMPLE:
                String sql = "INSERT INTO `pruebas` VALUES (NULL, 'peter', 0, CURRENT_TIMESTAMP);";
                DB.insert(sql);
                
				
				//INSERCION MULTIPLE:
                ArrayList<String> arrSQLs = new ArrayList<String>();
                
                String sql2 = "INSERT INTO `pruebas`.`usuarios` VALUES (NULL, 'peter1', 'capusotto', 'pCapusotto@gmail.com');";
                String sql3 = "INSERT INTO `pruebas`.`usuarios` VALUES (NULL, 'peter2', 'capusotto', 'pCapusotto@gmail.com');";
                String sql4 = "INSERT INTO `pruebas`.`usuarios` VALUES (NULL, 'peter3', 'capusotto', 'pCapusotto@gmail.com');";
                arrSQLs.add(sql2);
                arrSQLs.add(sql3);
                arrSQLs.add(sql4);
                //sDB.insertMultiple(arrSQLs);
                
                
                //LECTURA DE STRINGS:
                ArrayList<Object> arr = DB.query("SELECT * FROM pruebas");
                
                for(Object o : arr)
                {
                    System.out.println("objetos = "  + o.toString());
                }	
                
                //MAPEO TIPO ORM:
                ArrayList<Object> arr2 = (ArrayList<Object> )db.DB.mapear("SELECT * FROM `pruebas`",Prueba.class);

                //System.out.println("size = " + arr.size());
                for(Object o : arr2)
                {
                    Prueba p = (Prueba) o;
                    System.out.println("" + p.toString());
                }
				
        }
        
}
