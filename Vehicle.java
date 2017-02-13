 class Vehicle{
  private int mYear;
  private int mMiles;
  private int mPrice;
  private String mModel;
  private String mBrand;
  //creating a constructor
  public Vehicle(int year, String brand, String model, int miles, int price ){
    mYear = year;
    mBrand = brand;
    mModel = model;
    mMiles = miles;
    mPrice = price;
  }
//custom method
public boolean worthBuying(int maxPrice){
  return(mPrice < maxPrice);
}
//Craeating the getter method
public int getPrice() {
   return mPrice;
 }

 public int getYear() {
   return mYear;
 }

 public String getBrand() {
   return mBrand;
 }

 public String getModel() {
   return mModel;
 }

 public int getMiles() {
   return mMiles;
 }

}
