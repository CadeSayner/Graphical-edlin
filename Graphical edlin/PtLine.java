import java.lang.Math;

public class PtLine extends VectorObject
{
   int bx;
   int by;
   int ys;
   
   public PtLine(int id, int x, int y, int bx, int by)
   {
      super(id, x, y);
      this.bx = bx;
      this.by = by;
      
      if (x != bx && y != by)
      {
      if (Math.abs(this.by - this.y) > Math.abs(this.bx - this.x))
      {
         int tmpbx = this.bx;
         this.bx = this.by;
         this.by = tmpbx;
         
         int tmpx = this.x;
         this.x = this.y;
         this.y = tmpx;
      }
      
      if (x > bx)
      {
         int tmpbx = this.bx;
         this.bx = this.x;
         this.x = tmpbx;
         
         int tmpby = this.by;
         this.by = this.y;
         this.y = tmpby;
      }
      
      if (this.y < this.by)
      {
         ys = 1;
      }
      else
      {
         ys = -1;
      }
      }
   }
   
   public void draw(char [][] matrix)
   {
      if(x == bx)
      {
         if (by > y)
         {
            for(int j = y; j <= by; j++)
            {
               matrix[j][x] = '*';
            }
         }
         
         else
         {
            for(int j = by; j <= y; j++)
            {
               matrix[j][x] = '*';
            }
         }

      }
      
      else if(y == by)
      {
         if (bx > x)
         {
            for(int j = x; j <= bx; j++)
            {
               matrix[y][j] = '*';
            }
         }
         
         else
         {
            for(int j = bx; j <= x; j++)
            {
               matrix[y][j] = '*';
            }
         }
      }
      
      else
      {
         double m = (float)Math.abs(by - y) / (float)Math.abs(bx - x);
         int j = y;
         double error = 0;
      
         for (int i = x; i <= bx; i++)
         {
            if (Math.abs(by - y) > Math.abs(bx - x))
            {
               matrix[j][i] = '*';
            }
         
            else
            {
               matrix[i][j] = '*';
            }
         
            error = error + m;
         
            if (error > 0.5)
            {
               j = j+ys;
               error--;
            }

         }
     }
   } 
}

