/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mongoproyect;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author oracle
 */
public class Update {
   public static void main(String[] args) {
         //Establecemos la conexión a la base de datos "Twitter" de Mongo
        MongoClient cli = new MongoClient("localhost", 27017);
        MongoDatabase base = cli.getDatabase("training");
        //Obtenemos la colección Tweets
        MongoCollection<Document> colection = base.getCollection("scores");
        colection.updateOne(new Document("_id", 1), new Document("$inc", new Document("scores", 2)));
        
    }
}
