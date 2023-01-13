package com;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Dimension;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;



public class Matriz extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int n;
	int m;
	JLabel [][] kap;
	int cx=50, cy=10, cz=20, cw=30;
	
	JScrollPane kep;
	
	public void Eventos(KeyEvent e){
		
		
		
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				kap[i][j].setBounds(cx,cy,cz,cw);
				if(e.getSource()==kap[i][j]&&e.getKeyCode()==KeyEvent.VK_ENTER){
				cx+=10;
					kap[i][j].transferFocus();
				}
			cy+=20;
			cx=50;
			
			
			}
		}
		
	}
	
	public void SNumeros(JTextField txtpre){
		txtpre.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e){
				char c = e.getKeyChar();
				
				if(Character.isLetter(c)){
					
				getToolkit().beep();
					e.consume();

				}
				}
		}
		);	
		}
	public void Spunt(JTextField txtpre){
		txtpre.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e){
				int k = (int)e.getKeyChar();
				
				
				if(k>=45&&k<=57){
					if(k==46){
						e.setKeyChar((char)KeyEvent.VK_CLEAR);
						}
					
					if(k==45){
						e.setKeyChar((char)KeyEvent.VK_CLEAR);
						}
					
					if(k==47){
						
								e.setKeyChar((char)KeyEvent.VK_CLEAR);
						}
					
				}else {
					e.setKeyChar((char)KeyEvent.VK_CLEAR);
					e.consume();
				}
				
				
				}
		}
		);	
		}
	
	
	
	

	
		public static void main(String[] args) {
			
			Matriz ventana=new Matriz("Ingresar Datos",800,500,400,400);

		}
		public Matriz(String title,int height,int width,int x,int y){			
			
			JPanel panel=new JPanel();
			JPanel panel1=new JPanel();	 
			
			
			
			
			JScrollPane kop = new JScrollPane(panel1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED );
			
			panel1.setBounds(800, 800, 800, 800);
			kop.setBounds(600, 600, 600, 600);
			kop.setViewportView(panel1);
			
			 
			 
			 
				JFrame ventana1=new JFrame();				
				ventana1.setTitle(title);				
				ventana1.setSize(height,width);				
				ventana1.setLocation(x, y);	
				ventana1.setResizable(true);
				ventana1.setExtendedState(MAXIMIZED_BOTH);
		        ventana1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		      
		        JButton boton=new JButton();		        
		        boton.setText("Mostrar");		        
		        boton.setBounds(850, 550, 100, 30);
		        
		        JButton boton2=new JButton();		        
		        boton2.setText("Salir");		        
		        boton2.setBounds(950, 950, 100, 30);
		        
		        JLabel pre = new JLabel ();		        		
		        pre.setText("Numero de Tablas");				
				pre.setBounds(800, 450, 120, 20);
				
				JTextField txtpre = new JTextField();				
				txtpre.setBounds(950,450, 100, 20);
				
				JLabel pre2 = new JLabel ();		        		
		        pre2.setText("Hasta");				
				pre2.setBounds(800, 500, 100, 20);
				
				JTextField txtpre2 = new JTextField();				
				txtpre2.setBounds(950,500, 100, 20);
				
				for(int i=0; i<3; i++){
					for(int j=0; j<3; j++){
				
						
				SNumeros(txtpre);
				Spunt(txtpre);
				}}
				for(int i=0; i<3; i++){
					for(int j=0; j<3; j++){
				
						
				SNumeros(txtpre2);
				Spunt(txtpre2);
				}}				
				
				
				
		        
				txtpre.addKeyListener(						
						new KeyListener(){							
							public void keyPressed(KeyEvent e){								
								if(e.getKeyCode()==KeyEvent.VK_ENTER){					
								
								
								txtpre2.grabFocus();								
								}//getKeyCode								
							}//keypressed							
							public void keyReleased(KeyEvent e){								
							}//keyReleased							
							public void keyTyped(KeyEvent e){								
							}//keyType}							
						}//keyListener						
		);//addKeyListener
				
				txtpre2.addKeyListener(						
						new KeyListener(){							
							public void keyPressed(KeyEvent e){								
								if(e.getKeyCode()==KeyEvent.VK_ENTER){					
								
								
								boton.grabFocus();								
								}//getKeyCode								
							}//keypressed							
							public void keyReleased(KeyEvent e){								
							}//keyReleased							
							public void keyTyped(KeyEvent e){								
							}//keyType}							
						}//keyListener						
		);//addKeyListener


		        
		        boton.addActionListener(new ActionListener (){		        	
		        	public void actionPerformed(ActionEvent e){
		        		
		        		if(pre.getText().equals(null)||pre.getText().equals("")&&pre2.getText().equals(null)||pre2.getText().equals("")){
							
							JOptionPane.showMessageDialog(null, "No ha ingresado un número.", "Error", JOptionPane.DEFAULT_OPTION, null);
							
						}else {
							
							ventana1.add(kop);	
				        	ventana1.remove(panel);   
				        	ventana1.setContentPane(kop); 		    		       
				    		ventana1.validate();
				    		ventana1.repaint();;
		        		
		        		
		        		n=Integer.parseInt(txtpre.getText());
		    			m=Integer.parseInt(txtpre2.getText());
		    			
		    			kap = new JLabel[n][m];
		    			
		    			
		    			
				        
				        for(int i=0; i<n; i++){
							for(int j=0; j<m; j++){
								kap[i][j] = new JLabel();
								
								
							}//for
						}//for
						for(int i=0; i<n; i++){
							for(int j=0; j<m; j++){
								kap[i][j].setText((i+1) + " * "+ (j+1) + " = " + (i+1) * (j+1));
								kap[i][j].setBounds(i*100+10,j*40+10,90,30);
								
								panel1.setVisible(true);
								panel1.setLayout(null);
								
										panel1.add(kap[i][j]);
									
								
									}//for
						}//for
						
						
						
						ventana1.setTitle("Tablas de Multiplicar");
						
						panel1.setPreferredSize(new Dimension(n*100,m*42));
		    		
						}
		        	}//public void		        	
		        		}//ActionListener		        
		        			);//addListener
		        
		        
		        
		        boton2.addActionListener(new ActionListener (){		        	
		        	public void actionPerformed(ActionEvent e){
		        		
		        		System.exit(0);
		        		
		        	}//public void		        	
        		}//ActionListener		        
        			);//addListener
		        
		        
		       
		        
		        panel1.add(boton2);
		        panel.add(txtpre);
		        panel.add(pre);
		        panel.add(txtpre2);
		        panel.add(pre2);
		        panel.add(boton);
		        panel.setLayout(null);		        
		      ventana1.setContentPane(panel);
		      
		        ventana1.setVisible(true);
		        ventana1.setLayout(null);
		        
			}//public

}
