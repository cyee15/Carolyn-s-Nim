public class SmartNim // trying to make te other player have [1+3(x)]
  //by carolyn
{ 
  
  int take, number;

  public SmartNim (int startrun)
  {
    number = startrun;
  }

  public int play(int pieces)
  {
    if (pieces % 3 == 0)
    {
      take = 2;
    }
    else if (pieces % 3 == 2)
    {
      take = 1;
    }
    else
    {
      if (Math.random() < .5)
      {
        take = 1;
      }
      else
      {
        take = 2;
      }
    }
  return take;
  }
      
  }
