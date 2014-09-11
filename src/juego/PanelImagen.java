
package juego;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelImagen extends JPanel

{
    private static int x;
    private static int y;
    private static String ruta;
    
    public static void valores(int vx,int vy,String rutas)
    {
        x += vx;
        y += vy; 
        ruta=rutas;
    }
    @Override
    public void paint(Graphics g)
    {
        Dimension tam=getSize();
        ImageIcon imagen;
        imagen = new ImageIcon(new ImageIcon(getClass().getResource(ruta)).getImage());
        g.drawImage(imagen.getImage(),x,y,tam.width,tam.height,null);
    }
    
}
    

