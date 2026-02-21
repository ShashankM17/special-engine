class Chairs{
Chairs(int number){
System.out.println("number of computers= "+ number);
}
Chairs(int number,String Name){
System.out.println("number of Chairs= "+ number + " "+ "name of Chairs"+Name);
}
Chairs(int number, Boolean ChairsisThere){
System.out.println("number of Chairs= "+ number +" "+ "Tables are there="+ ChairsisThere );
}
Chairs(int number, char type){
System.out.println("number of Chairs= "+ number + " "+"type of Chairs="+type);
}
Chairs(int number, float rating){
System.out.println("number of Chairs= "+ number +" "+ "ratings ="+ rating);
}
Chairs(String Name,int number){
System.out.println("name of Chairs= "+ number +" "+ "number of Tables="+ number);
}
Chairs(float rating,int number){
System.out.println("ratings ="+rating + " "+"number of Chairs= "+ number);
}
Chairs(char type,int price){
System.out.println("type of Chairs="+ type+" " +"price  of Chairs= "+ price);
}

}
