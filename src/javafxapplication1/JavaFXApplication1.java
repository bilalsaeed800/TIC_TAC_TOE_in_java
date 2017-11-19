/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.*;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
/**
 *
 * @author kmech
 */
public class JavaFXApplication1 extends Application {
    int ply=0,dgb=0;
    int arr[][]=new int[3][3];
    Stage mys;
    @Override
    public void start(Stage primaryStage) {
        mys=primaryStage;        
        firstStartfunction(primaryStage);
    }
    void firstStartfunction(Stage primaryStage)                                 //start manu function of a game first time control transfer here
    {
	StackPane bp=new StackPane();
        VBox vbox = new VBox(3);
        HBox hbox = new HBox();
        Pane start1=new Pane();
        Pane option1=new Pane();
	Pane about1=new Pane();
	Pane exit1=new Pane();
	Image sta=new Image("image/start.PNG");
        Image opt=new Image("image/option.PNG");
        Image abt=new Image("image/about.PNG");
        Image ext=new Image("image/exit1.PNG");

        ImageView sta1=new ImageView(sta);
        ImageView opt1=new ImageView(opt);
        ImageView abt1=new ImageView(abt);
        ImageView ext1=new ImageView(ext);

               
	sta1.setFitHeight(30);
        sta1.setFitWidth(90);
        
        opt1.setFitHeight(30);
        opt1.setFitWidth(90);

	abt1.setFitHeight(30);
        abt1.setFitWidth(90);
        
        ext1.setFitHeight(30);
        ext1.setFitWidth(90);

        sta1.minHeight(50);
        sta1.minWidth(50);
        opt1.minHeight(50);
        opt1.minWidth(50);
        abt1.minHeight(50);
        abt1.minWidth(50);
        ext1.minHeight(50);
        ext1.minWidth(50);
        
        start1.getChildren().add(sta1);
        option1.getChildren().add(opt1);
        about1.getChildren().add(abt1);
        exit1.getChildren().add(ext1);
        
        vbox.getChildren().addAll(start1,option1,about1,exit1);
        vbox.setAlignment(Pos.CENTER);
        hbox.getChildren().add(vbox);
        hbox.setAlignment(Pos.CENTER);
        bp.getChildren().add(hbox);
        bp.setAlignment(Pos.CENTER);
        
        start1.setOnKeyPressed(e -> {
            arr = new int[3][3];
            ply = 0;
            func1();
        });                      //buttons action
        start1.setOnMouseClicked(e -> {
            arr = new int[3][3];
            ply = 0;
            func1();
        });
        option1.setOnKeyPressed(e -> optionfunc(primaryStage));                      //buttons action
        option1.setOnMouseClicked(e -> optionfunc(primaryStage));       
        about1.setOnKeyPressed(e -> aboutfunc(primaryStage));                      //buttons action
        about1.setOnMouseClicked(e ->aboutfunc(primaryStage));        
        exit1.setOnKeyPressed(e -> exitgame(5));                      //buttons action
        exit1.setOnMouseClicked(e -> exitgame(5));
        
        primaryStage.setOnCloseRequest(e -> {                                   //direct close issue
            e.consume();
            exitgame(5);
        });
                                
        Scene scene = new Scene(bp,250,250);                             //scene creation
        
        
        scene.getStylesheets().add("style.css");
        primaryStage.setTitle("TIC TAC TOE");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        primaryStage.setMaxHeight(250);
        primaryStage.setMaxWidth(250);
        primaryStage.setMinHeight(250);
        primaryStage.setMinWidth(250);
    }
    void optionfunc(Stage mys)
    {        
//        System.out.println("Option");
        Label l1 = new Label("abhi nhe banaya!");
        Pane back = new Pane();
        VBox vbox = new VBox();
        HBox hbox = new HBox();
        
        StackPane st = new StackPane();
        Image im = new Image("image/back.PNG");
        ImageView vim = new ImageView(im);
        
        vim.setFitHeight(30);
        vim.setFitWidth(90);

        vim.minHeight(50);
        vim.minWidth(50);
        
        back.getChildren().add(vim);
        hbox.getChildren().add(back);
        hbox.setAlignment(Pos.BOTTOM_LEFT);
        vbox.setAlignment(Pos.BOTTOM_LEFT);
        vbox.getChildren().addAll(hbox);
        st.getChildren().addAll(l1,vbox);
        st.setAlignment(Pos.CENTER);
        
        back.setOnMouseClicked(e -> firstStartfunction(mys));
        
        mys.setOnCloseRequest(e -> {
            e.consume();
            exitgame(6);
        });
        Scene scene = new Scene(st,250,250);
        scene.getStylesheets().add("style.css");
        mys.setScene(scene);
        mys.show();
        
        mys.setMaxHeight(250);
        mys.setMaxWidth(250);
        mys.setMinHeight(250);
        mys.setMinWidth(250);
    }
    void aboutfunc(Stage mys)
    {        
        Label l1 = new Label("abhi nhe banaya!");
        Pane back = new Pane();
        VBox vbox = new VBox();
        HBox hbox = new HBox();
        
        StackPane st = new StackPane();
        Image im = new Image("image/back.PNG");
        ImageView vim = new ImageView(im);
        
        vim.setFitHeight(30);
        vim.setFitWidth(90);

        vim.minHeight(50);
        vim.minWidth(50);
        
        back.getChildren().add(vim);
        hbox.getChildren().add(back);
        hbox.setAlignment(Pos.BOTTOM_LEFT);        
        vbox.getChildren().addAll(hbox);
        vbox.setAlignment(Pos.BOTTOM_LEFT);
        st.getChildren().addAll(l1,vbox);
        st.setAlignment(Pos.CENTER);
        
        back.setOnMouseClicked(e -> firstStartfunction(mys));
        
        mys.setOnCloseRequest(e -> {
            e.consume();
            exitgame(3);
        });
        Scene scene = new Scene(st,250,250);
        scene.getStylesheets().add("style.css");
        mys.setScene(scene);
        mys.show();
        
        mys.setMaxHeight(250);
        mys.setMaxWidth(250);
        mys.setMinHeight(250);
        mys.setMinWidth(250);
    }
    
    void func1()
    {        
        Button btn = new Button("  "), btn3= new Button("  "), btn4= new Button("  ");
        Button btn5= new Button("  "), btn6= new Button("  "), btn7= new Button("  ");
        Button btn8= new Button("  "), btn9= new Button("  "), btn2 = new Button("  ");
        
        btn.setMaxWidth(Double.MAX_VALUE);
        btn2.setMaxWidth(Double.MAX_VALUE);
        btn3.setMaxWidth(Double.MAX_VALUE);
        btn4.setMaxWidth(Double.MAX_VALUE);
        btn5.setMaxWidth(Double.MAX_VALUE);
        btn6.setMaxWidth(Double.MAX_VALUE);
        btn7.setMaxWidth(Double.MAX_VALUE);
        btn8.setMaxWidth(Double.MAX_VALUE);
        btn9.setMaxWidth(Double.MAX_VALUE);
        
        Image bim= new Image("image/background.jpg");
        BackgroundSize bs=new BackgroundSize(250,250,false,false,false,false);
        BackgroundImage bgi=new BackgroundImage(bim,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,bs);
        Background bg= new Background(bgi);
        
        mys.setOnCloseRequest(e -> {
            e.consume();
            exitgame(4);
                });
        btn.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent e)
            {
                if(ply==1){
                    arr[0][0]=1;
                    btn.setText(" O ");
                    ply=0;
                }
                else
                {
                    arr[0][0]=2;
                    btn.setText(" X ");
                    ply=1;
                }
            funct();
            }
        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e)
            {
                if(ply==1)
                {
                    arr[0][1]=1;
                    btn2.setText(" O ");
                    ply=0;
                }
                else
                {
                    arr[0][1]=2;
                    btn2.setText(" X ");
                    ply=1;
                }  
            funct();
            }            
        });
        btn3.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent e)
            {
                if(ply==1)
                {
                    arr[0][2]=1;
                    btn3.setText(" O ");
                    ply=0;
                }
                else
                {
                    arr[0][2]=2;
                    btn3.setText(" X ");
                    ply=1;
                }  
            funct();
            }
        });
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e)
            {
                if(ply==1)
                {
                    arr[1][0]=1;
                    btn4.setText(" O ");
                    ply=0;
                }
                else
                {
                    arr[1][0]=2;
                    btn4.setText(" X ");
                    ply=1;
                }  
            funct();
            }
        });
        btn5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e)
            {
                if(ply==1)
                {
                    arr[1][1]=1;
                    btn5.setText(" O ");
                    ply=0;
                }
                else
                {
                    arr[1][1]=2;
                    btn5.setText(" X ");
                    ply=1;
                } 
            funct();
            }
        });
        btn6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e)
            {
                if(ply==1)
                {
                    arr[1][2]=1;
                    btn6.setText(" O ");
                    ply=0;
                }
                else
                {
                    arr[1][2]=2;
                    btn6.setText(" X ");
                    ply=1;
                } 
            funct();
            }
        });
        btn7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e)
            {
                if(ply==1)
                {
                    arr[2][0]=1;
                    btn7.setText(" O ");
                    ply=0;
                }
                else
                {
                    arr[2][0]=2;
                    btn7.setText(" X ");
                    ply=1;
                }  
            funct();
            }
        });
        btn8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e)
            {
                if(ply==1)
                {
                    arr[2][1]=1;
                    btn8.setText(" O ");
                    ply=0;
                }
                else
                {
                    arr[2][1]=2;
                    btn8.setText(" X ");
                    ply=1;
                } 
            funct();
            }
        });
        btn9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e)
            {
                if(ply==1)
                {
                    arr[2][2]=1;
                    btn9.setText(" O ");
                    ply=0;
                }
                else
                {
                    arr[2][2]=2;
                    btn9.setText(" X ");
                    ply=1;
                } 
            funct();
            }
        });
                
        HBox root= new HBox(10), root2= new HBox(10),root3= new HBox(10);
        VBox mai=new VBox(10);
        Pane new1 = new Pane();
        Pane backg = new Pane();
        VBox vbox1 = new VBox(3);                
        HBox hbox1= new HBox();
//        BorderPane bp=new BorderPane();
        
        Image ne=new Image("image/new.PNG");
        ImageView ne1=new ImageView(ne);
        
        ne1.setFitHeight(30);
        ne1.setFitWidth(70);
        new1.getChildren().add(ne1);
        vbox1.getChildren().add(new1);
        vbox1.setAlignment(Pos.TOP_LEFT);
        hbox1.getChildren().add(vbox1);
        hbox1.setAlignment(Pos.TOP_RIGHT);
//        bp.setTop(vbox1);        
        
        new1.setOnMouseClicked(e -> {
            arr = new int[3][3];
            ply = 0;
            func1();
        });
        
        root.getChildren().addAll(btn,btn2,btn3);
        root2.getChildren().addAll(btn4,btn5,btn6);
        root3.getChildren().addAll(btn7,btn8,btn9);
        
        root2.setSpacing(10);
        root3.setSpacing(10);
        root.setSpacing(10);
        
        root2.setMaxWidth(Double.MAX_VALUE);
        root3.setMaxWidth(Double.MAX_VALUE);
        root.setMaxWidth(Double.MAX_VALUE);
        
        root2.setAlignment(Pos.CENTER);
        root3.setAlignment(Pos.CENTER);
        root.setAlignment(Pos.CENTER);
                
//        backg.setBackground(bg);
//        bp.setCenter(backg);
//        bp.setCenter(mai);
        
//        bp.setTop(vbox1);      
//        bp.getChildren().add(mai);
        
        mai.setAlignment(Pos.CENTER);
        mai.getChildren().addAll(hbox1,root,root2,root3);
        mai.setMaxWidth(Double.MAX_VALUE);
        mai.setSpacing(10);
        
        Scene scene = new Scene(mai, 250, 250);
        scene.getStylesheets().add("style.css");
        
        mys.setMaxHeight(250);
        mys.setMinHeight(250);
        mys.setMaxWidth(250);
        mys.setMinWidth(250);
        
        mys.setTitle("TIC TAC TOE!");
        mys.setScene(scene);
        mys.show();
    }                 
    /**
     * @param args the command line arguments
     */
    void func2(int who)
    {
        Pane pla1 = new Pane(),ext1 = new Pane(),main1 = new Pane();
        VBox vbox = new VBox(3);
        VBox vbox1 = new VBox(3);        
        HBox hbox = new HBox();
        
        Image play=new Image("image/again.PNG");
        Image exit=new Image("image/exit.PNG");
        Image main=new Image("image/Capture.PNG");
        ImageView pla=new ImageView(play);
        ImageView ext=new ImageView(exit);
        ImageView mai1=new ImageView(main);
        
        pla.setFitHeight(35);
        pla.setFitWidth(100);        
        ext.setFitHeight(35);
        ext.setFitWidth(100);               
        mai1.setFitHeight(40);
        mai1.setFitWidth(100);
        
        pla1.getChildren().add(pla);
        ext1.getChildren().add(ext);                        
        main1.getChildren().add(mai1);    
        
        mys.setOnCloseRequest(e -> {
            e.consume();
            exitgame(who);
        });
        
        Label  l1 = new Label("");
        if(who == 2)
            l1 = new Label("horrah player 1 wins");
        else if(who == 1)
            l1 = new Label("horrah player 2 wins");
        
//        LeftButton lefy = new LeftButton();
        vbox1.getChildren().add(l1);
        vbox1.setAlignment(Pos.TOP_CENTER);   
        vbox.getChildren().addAll(pla1,main1,ext1);
        vbox.setAlignment(Pos.CENTER);   
        
        hbox.getChildren().addAll(vbox);
        hbox.setAlignment(Pos.CENTER);        
                
        StackPane st = new StackPane();
        st.getChildren().addAll(vbox1,hbox);
        st.setAlignment(Pos.CENTER);
        Scene scene2 = new Scene(st,250,250);
        scene2.getStylesheets().add("style.css");
        
//        pla.autosize();
//        ext.autosize();
        
        pla1.setOnMouseClicked(e -> {
            arr = new int[3][3];
            ply = 0;
            func1();
        });        
        ext1.setOnMouseClicked(e -> {
            exitgame(who);        
        });
        main1.setOnMouseClicked(e -> {
            firstStartfunction(mys);
        });
        mys.setMaxHeight(250);
        mys.setMinHeight(250);
        mys.setMaxWidth(250);
        mys.setMinWidth(250);
        
        mys.setScene(scene2);
        mys.show();        
    }
    
    void exitgame(int id)
    {
        Pane yes1 = new Pane(),no1 = new Pane();
        VBox vbox = new VBox(3);
        VBox vbox1 = new VBox(3);
        VBox vbox2 = new VBox(3);
        HBox hbox = new HBox();
        
        Image nim=new Image("image/yes.PNG");
        Image rim=new Image("image/no.PNG");
        ImageView nv=new ImageView(nim);
        ImageView rv=new ImageView(rim);
        
        nv.setFitHeight(35);
        nv.setFitWidth(75);
        
        rv.setFitHeight(35);
        rv.setFitWidth(85);
               
        yes1.getChildren().add(nv);
        no1.getChildren().add(rv);                
                
        Label l1 = new Label("Are you sure you want to Quit?");
        yes1.setOnMouseClicked(e -> mys.close());
        
        no1.setOnMouseClicked(e -> {
            if(id == 5)
            {
                firstStartfunction(mys);
            }
            else if(id ==6)
            {
                optionfunc(mys);
            }
            else if(id == 3)
            {
                aboutfunc(mys);
            }
            else if(id==4)
            {
                arr = new int[3][3];
                ply = 0;            
                func1();
            }
            else if(id == 1 || id == 2)
            {
                func2(id);
            }
        });
        
//        hbox.getChildren().addAll(noext,ext);
        vbox1.getChildren().add(l1);
        vbox1.setAlignment(Pos.TOP_CENTER);
        
        vbox.getChildren().addAll(yes1,no1);
        vbox.setAlignment(Pos.CENTER);
//        vbox.setLayoutX(40);
//        vbox.setLayoutY(40);
        
//        vbox2.getChildren().addAll(vbox1,vbox);
//        vbox2.setAlignment(Pos.CENTER);
        hbox.getChildren().add(vbox);
        hbox.setAlignment(Pos.CENTER);                
        StackPane st = new StackPane();
        st.getChildren().addAll(vbox1,hbox);
        st.setAlignment(Pos.CENTER);        
//        
        Scene scene2 = new Scene(st,250,250);
        scene2.getStylesheets().add("style.css");
        
        mys.setMaxHeight(250);
        mys.setMinHeight(250);
        mys.setMaxWidth(250);
        mys.setMinWidth(250);
        
        mys.setScene(scene2);
        mys.show();    
        
    }
    
    void funct()
    {
        if(dgb==1)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                    System.out.print(arr[j][k]+" ");
                System.out.println();
            }
        }
   
        for(int i=0;i<3;i++)
        {
            if(arr[i][0]==2&&arr[i][1]==2&&arr[i][2]==2)                            
                func2(2);            
        }
        for(int i=0;i<3;i++)
        {
            if(arr[0][i]==2&&arr[1][i]==2&&arr[2][i]==2)
                func2(2);
        }
        if(arr[0][0]==2&&arr[1][1]==2&&arr[2][2]==2)
            func2(2);
        if(arr[0][2]==2&&arr[1][1]==2&&arr[2][0]==2)
        func2(2);
            
        for(int i=0;i<3;i++)
        {
            if(arr[i][0]==1&&arr[i][1]==1&&arr[i][2]==1)
            func2(1);            
        }
        for(int i=0;i<3;i++)
        {
            if(arr[0][i]==1&&arr[1][i]==1&&arr[2][i]==1)
            func2(1);                                  
        }
        if(arr[0][0]==1&&arr[1][1]==1&&arr[2][2]==1)
        func2(1);
        
        if(arr[0][2]==1&&arr[1][1]==1&&arr[2][0]==1)
        func2(1);
        
    }
    
    public static void main(String[] args) 
    {
        launch(args);
    }   
}