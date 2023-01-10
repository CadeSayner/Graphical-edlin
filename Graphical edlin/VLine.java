public class VLine extends VectorObject
{
   int len; 
   
   public VLine(int id, int x, int y, int len)
   {
      super(id, x, y);
      this.len = len;
   }
   
   public void draw(char [][] matrix)
   {
         for(int j = y; j < y + len; j++)
         {
            matrix[j][x] = '*';
         }
   }
}