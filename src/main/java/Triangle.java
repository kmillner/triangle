public class Triangle {

  private Integer mSideA;
  private Integer mSideB;
  private Integer mSideC;

  public Triangle(int sidea, int sideb, int sidec){
    mSideA = sidea;
    mSideB = sideb;
    mSideC = sidec;

  }

  public int getSideA() {
    return mSideA;
  }

  public int getSideB() {
    return mSideB;
  }
    public int getSideC() {
      return mSideC;
    }



  public Boolean isTriangle() {

  Boolean isTriangle = true;

  if (mSideA+mSideB < mSideC || mSideA + mSideC < mSideB ||
      mSideB + mSideC < mSideA) {
     isTriangle = false;
    }

  return isTriangle;
  }

  public String getTriangleType() {
    String triangleType;

    if (mSideA == mSideB && mSideB == mSideC){
      triangleType = "equilateral";
    } else if (mSideA != mSideB && mSideA != mSideC && mSideB != mSideC){
      triangleType = "scalene";
    } else {
      triangleType = "isosceles";
    }

    return triangleType;
  }
}
