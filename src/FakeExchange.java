public class FakeExchange implements Exchange {

  public float rate(String origin, String target) {
    float rateNum = 0;
    if ("USD".equals(origin) && "Euro".equals(target)) {
     rateNum = 1;
    }
    return rateNum;
  };
  
}
