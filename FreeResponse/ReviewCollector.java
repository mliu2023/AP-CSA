public class ReviewCollector{

  public void addReview(Productreview prodReview){
    reviewList.add(prodReview);
    String name = prodReview.getName();
    boolean x = true;
    for(int i = 0; i < productList.size(); i++){
      if(productList.get(i).equals(name)){
        x = false;
      }
    }
    if(x){
      productList.add(name);
    }
  }

  public int getNumGoodReviews(String prodName){
    int counter = 0;
    for(int i = 0; i < reviewList.size(); i++){
      if(((reviewList.get(i)).getName()).equals(prodName)){
        if((reviewList.get(i).getReview()).indexOf("best") >= 0){
          counter++;
        }
      }
    }
    return counter;
  }
}
