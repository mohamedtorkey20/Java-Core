class Roots{
float r1,r2;
boolean imag;

public Roots()
{
this.r1=this.r2=0;
this.imag=false;
}

public Roots(float root1,boolean imag)
{
this.r1=this.r2=root1;
this.imag=imag;
}
public Roots(float r1,float r2,boolean imag)
{
this.r1=r1;
this.r2=r2;
this.imag=imag;

}


public  void setroot1(float root1)
{
this.r1=root1;
}

public void setroot2(float root2)
{
this.r2=root2;
}
public void setimaginary(boolean  imag)
{
this.imag=imag;
}


public boolean getimaginary()
{
return this.imag;
}

public float getroot1()
{
return this.r1;
}

public float getroot2()
{
return this.r2;
}
}
