/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mongoproyect;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author oracle
 */
public class ConsultaTwitter {

    /**
     * @param args the command line arguments
     */
    /**
    public static void main(String[] args) {
       //Establecemos la conexión a la base de datos "Twitter" de Mongo
       MongoClient cli = new MongoClient("localhost", 27017);
       MongoDatabase base = cli.getDatabase("twitter");
       //Obtenemos la colección Tweets
       MongoCollection <Document> colection = base.getCollection("tweets");
       //Creamos un objeto que funcionará como criterio de búsqueda
       BasicDBObject consulta = new BasicDBObject ("retweeted",true);
       //Creamos un cursor mediante un objeto iterable
       FindIterable<Document> cursor = colection.find(consulta);
       //Usamos un iterador para recorrer el cursor.
       MongoCursor<Document> iterator = cursor.iterator();
       while (iterator.hasNext()){
           Document obj = iterator.next();
           System.out.println(obj.getString("text")); //También tenemos .get() a secas. 
       }
       //Cerramos el cliente
       cli.close();
    }
    **/
}
