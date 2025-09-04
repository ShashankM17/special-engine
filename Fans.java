class Fans{ 
Fans(int number){
System.out.println("number of Fans=  "+ number);
}
Fans(int number,String Name){
System.out.println("number of Fans=  "+ number + ","+ "name of Fans= "+Name);
}
Fans(int number, Boolean FansAreThere){
System.out.println("number of Fans=  "+ number +","+ "Tables are there= "+ FansAreThere );
}
Fans(int number, char type){
System.out.println("number of Fans=  "+ number + ","+"type of Chairs= "+type);
}
Fans(int number, float rating){
System.out.println("number of Fans=  "+ number +","+ "ratings = "+ rating);
}
Fans(String Name,int number){
System.out.println("name of Fans=  "+ number +","+ "number of Fans= "+ number);
}
Fans(float rating,int number){
System.out.println("ratings = "+rating + ","+"number of Fans=  "+ number);
}
Fans(char type,int price){
System.out.println("type of Fans= "+ type+"," +"price  of Fans=  "+ price);
}

}
