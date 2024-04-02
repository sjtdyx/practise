import java.io.*;
public class App {
    public static void main(String[] args) throws Exception {
       String filePath="C:\\Users\\51123\\Downloads\\Groceries (1).txt ";
        String fileToWrite="C:\\Users\\51123\\Desktop\\PROG-2-2024\\GroceriesFormatted.txt";
       String []array=new String[4];
       //String[]array1=new String[4];
       String id ;
       String item;
       String quantity;
       double price;
       //String temp="";
       String seperator=",";
       double total =0;
       //FileOutputStream fileOutputStream=new FileOutputStream(null);
       FileReader fileReader=new FileReader(filePath);
       FileWriter fileWriter=new FileWriter(fileToWrite);
       BufferedReader reader=new BufferedReader(fileReader);
       BufferedWriter writer=new BufferedWriter(fileWriter);
       String line;
       writer.write("****************************************************");
       writer.newLine();
       writer.write("ID"+"\t"+"Item"+"\t\t"+"Quantity"+"\t"+"Price (€)");
       writer.newLine();


       //byte[]data="array[3]".getBytes();
       while((line=reader.readLine())!=null){//evenry line constantly ,for several lines,util nothing is in the txt

        array=line.split(seperator);
        id=array[0];
        item=array[1];
        quantity=array[2];
        price=Double.parseDouble(array[3]);

        //price=Double.parseDouble (array[3]);//convert  string to double ,the price is stored in index 3

        total+=price;
        if(quantity.length()<5){
          line=id+"\t"+item+"\t\t"+quantity+"\t\t\t"+price;
        }else if(quantity.length()>=5){
          line=id+"\t"+ item+"\t\t"+quantity+"\t\t"+price;
        }

        
        System.out.println(line);
        
        writer.write(line);
        writer.newLine();
       }
       System.out.println("total price of groceries:"+Math.round(total));
       writer.write("****************************************************");
       writer.newLine();
       writer.write("The grocery shopping total is: €42"+Math.round(total));
       writer.newLine();
       writer.write("****************************************************");
       writer.newLine();
       reader.close();
       writer.close();

}


       
       //int n;
       //const int size=11;
       //int*list=malloc(size*izeof(int));

       //int main(){
        //String file
      // }
    }
    

