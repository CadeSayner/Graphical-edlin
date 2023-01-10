public class HLine extends VectorObject
{
   int len;
   
   public HLine(int id, int x, int y, int len)
   {
      super(id, x, y);
      this.len = len;
   }
   
   public void draw(char [][] matrix)
   {
         for(int j = x; j < x + len; j++)
         {
            matrix[y][j] = '*';
         }
   }
}