public class Rectangle extends VectorObject
{
   int lenx;
   int leny;
   public Rectangle(int id, int x, int y, int lenx, int leny)
   {
      super(id, x, y);
      this.lenx = lenx;
      this.leny = leny;
   }
   public void draw(char [][] matrix)
   {
      for (int i = x; i < x + lenx; i++)
      {
         for(int j = y; j < y + leny; j++)
         {
            matrix[i][j] = '*';
         }
      }
   }
}