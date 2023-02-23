
package com.mycompany.task1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.PrimaryStage;
import javafx.stage.Stage;

public class HelloWorld extends Application{

    
    public void start(PrimaryStage stage) throws Exception {
        Text Helloworld =new Text("Hello world FX !!!");
        StackPane sp =new StackPane(Helloworld);
        Scene scene=new Scene(sp,400,400);
        PrimaryStage.setScene(scene);
        PrimaryStage.show();
    }

 
    
}
