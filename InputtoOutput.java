/*This class generates the Input to Output window of the Downstream Processing Optimization Application
*The values of the input parameters are entered which are then processed to give the optimized values
*@author Prateek Sappadla
*
*/


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class InputtoOutput extends JFrame implements ActionListener
{
	JButton submit;
	JButton clear;	
	JPanel panel1;
	JPanel panel2;
	
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34 ;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29,t30,t31,t32,t33,t34,t35,t36;

	
	//Constructor for the class
	public InputtoOutput()
	{
		this.setTitle("Input to Output");
		this.setLayout(new FlowLayout());
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		this.getContentPane().add(panel1);
		this.getContentPane().add(panel2);		
		
		GridLayout grid = new GridLayout(14,5,30,20);		
		panel1.setLayout(grid);

		l1 = new JLabel("Parameter");
		l2 = new JLabel("Lower Bound");
		l3 = new JLabel("Upper Bound");
		l4 = new JLabel("Increment");
		l5 = new JLabel("Units");
		l6 = new JLabel("Harvest Concentration");

		panel1.add(l1);
		panel1.add(l2);
		panel1.add(l3);
		panel1.add(l4);
		panel1.add(l5);
		panel1.add(l6);

		t1 = new JTextField(20);
		t2 = new JTextField(20);
		t3 = new JTextField(20);
		l7 = new JLabel("grams/litre");
		panel1.add(t1);
		panel1.add(t2);
		panel1.add(t3);
		panel1.add(l7);

		l8 = new JLabel("Capture Binding Capacity");
		t4 = new JTextField(20);
		t5 = new JTextField(20);
		t6 = new JTextField(20);
		l9 = new JLabel("grams/litre");
		panel1.add(l8);
		panel1.add(t4);
		panel1.add(t5);
		panel1.add(t6);
		panel1.add(l9);
		
		l10 = new JLabel("Capture Flow Rate");
		t7 = new JTextField(20);
		t8 = new JTextField(20);
		t9 = new JTextField(20);
		l11 = new JLabel("litres/hour");
		panel1.add(l10);
		panel1.add(t7);
		panel1.add(t8);
		panel1.add(t9);
		panel1.add(l11);

		l12 = new JLabel("Capture pH");
		t10 = new JTextField(20);
		t11= new JTextField(20);
		t12 = new JTextField(20);
		l13 = new JLabel("");
		panel1.add(l12);
		panel1.add(t10);
		panel1.add(t11);
		panel1.add(t12);
		panel1.add(l13);

		l14 = new JLabel("Intermediate Binding Capacity");
		t13 = new JTextField(20);
		t14= new JTextField(20);
		t15 = new JTextField(20);
		l15 = new JLabel("grams/litre");
		panel1.add(l14);
		panel1.add(t13);
		panel1.add(t14);
		panel1.add(t15);
		panel1.add(l15);

		l16 = new JLabel("Intermediate Flow Rate");
		t16 = new JTextField(20);
		t17= new JTextField(20);
		t18 = new JTextField(20);
		l17 = new JLabel("litres/hour");
		panel1.add(l16);
		panel1.add(t16);
		panel1.add(t17);
		panel1.add(t18);
		panel1.add(l17);

		l18 = new JLabel("Intermediate pH");
		t19 = new JTextField(20);
		t20 = new JTextField(20);
		t21 = new JTextField(20);
		l19 = new JLabel("");
		panel1.add(l18);
		panel1.add(t19);
		panel1.add(t20);
		panel1.add(t21);
		panel1.add(l19);
		
		l20 = new JLabel("Polishing Binding Capacity");
		t22 = new JTextField(20);
		t23= new JTextField(20);
		t24= new JTextField(20);
		l21 = new JLabel("grams/litre");
		panel1.add(l20);
		panel1.add(t22);
		panel1.add(t23);
		panel1.add(t24);
		panel1.add(l21);

		l22 = new JLabel("Polishing Flow Rate");
		t25 = new JTextField(20);
		t26 = new JTextField(20);
		t27 = new JTextField(20);
		l23 = new JLabel("litres/hour");
		panel1.add(l22);
		panel1.add(t25);
		panel1.add(t26);
		panel1.add(t27);
		panel1.add(l23);
		
		l24 = new JLabel("Polishing pH");
		t28 = new JTextField(20);
		t29 = new JTextField(20);
		t30 = new JTextField(20);
		l25 = new JLabel("");
		panel1.add(l24);
		panel1.add(t28);
		panel1.add(t29);
		panel1.add(t30);
		panel1.add(l25);

		l26 = new JLabel("Number of Cycles(Capture)");
		t31 = new JTextField(20);
		t32= new JTextField(20);
		l27 = new JLabel("");
		l28 = new JLabel("");
		panel1.add(l26);
		panel1.add(t31);
		panel1.add(t32);
		panel1.add(l27);
		panel1.add(l28);

		l29 = new JLabel("Number of Cycles(Intermediate)");
		t33 = new JTextField(20);
		t34= new JTextField(20);
		l30 = new JLabel("");
		l31 = new JLabel("");
		panel1.add(l29);
		panel1.add(t33);
		panel1.add(t34);
		panel1.add(l30);
		panel1.add(l31);

		l32 = new JLabel("Number of Cycles(Polishing)");
		t35 = new JTextField(20);
		t36= new JTextField(20);
		l33 = new JLabel("");
		l34 = new JLabel("");
		panel1.add(l32);
		panel1.add(t35);
		panel1.add(t36);
		panel1.add(l33);
		panel1.add(l34);


		submit = new JButton("Submit");
		clear = new JButton("Clear");

		panel2.add(submit);
		panel2.add(clear);

		clear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");
				t7.setText("");
				t8.setText("");
				t9.setText("");
				t10.setText("");
				t11.setText("");
				t12.setText("");
				t13.setText("");
				t14.setText("");
				t15.setText("");
				t16.setText("");
				t17.setText("");
				t18.setText("");
				t19.setText("");
				t20.setText("");
				t21.setText("");
				t22.setText("");
				t23.setText("");
				t24.setText("");
				t25.setText("");
				t26.setText("");
				t27.setText("");
				t28.setText("");
				t29.setText("");
				t30.setText("");
				t31.setText("");
				t32.setText("");
				t33.setText("");
				t34.setText("");
				t35.setText("");
				t36.setText("");		
			}
		}
		);

		submit.addActionListener(this);
	}

	//Event Handler for the submit button
	public void actionPerformed(ActionEvent ae) 
	{
		/*try{	
		FileWriter fw = new FileWriter("/home/prateek2693/downstreamiterations.csv");
        	PrintWriter pw = new PrintWriter(fw);
        	pw.print("Harvest Concentration,Harvest Volume,Capture Binding Capacity,Capture Flow Rate,Capture pH,Intermediate Binding Capacity,Intermediate Flow Rate,Intermediate pH,Polishing Binding Capacity,Polishing Flow Rate,Polishing pH, Final product, Total Time, Batches per year, Total product, Revenue");
		pw.flush();
		pw.close();
		fw.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}*/
		
		
		double harvest_l=0,harvest_u=0,harvest_inc=0,capture_binding_capacity_l=0,capture_binding_capacity_u=0,capture_binding_capacity_inc=0;
		double capture_flow_rate_l=0,capture_flow_rate_u=0,capture_flow_rate_inc=0,capture_ph_l=0,capture_ph_u=0,capture_ph_inc=0;
		double intermediate_binding_capacity_l=0,intermediate_binding_capacity_u=0,intermediate_binding_capacity_inc=0, intermediate_flow_rate_l=0,intermediate_flow_rate_u=0,intermediate_flow_rate_inc=0;
		double intermediate_ph_l=0,intermediate_ph_u=0,intermediate_ph_inc=0;
		double polishing_binding_capacity_l=0,polishing_binding_capacity_u=0,polishing_binding_capacity_inc=0;
		double polishing_flow_rate_l=0,polishing_flow_rate_u=0,polishing_flow_rate_inc=0,polishing_ph_l=0,polishing_ph_u=0,polishing_ph_inc=0;
		double noc_capture_l=0,noc_capture_u=0,noc_intermediate_l=0,noc_intermediate_u=0,noc_polishing_l=0,noc_polishing_u=0;
		
		//Read all the values from the textfields and save them into variables
		try
		{
		harvest_l = Double.parseDouble(t1.getText().toString()); 
		harvest_u = Double.parseDouble(t2.getText().toString()); 
		harvest_inc = Double.parseDouble(t3.getText().toString());
		
		capture_binding_capacity_l= Double.parseDouble(t4.getText().toString()); 
		capture_binding_capacity_u= Double.parseDouble(t5.getText().toString()); 
		capture_binding_capacity_inc= Double.parseDouble(t6.getText().toString());
		capture_flow_rate_l = Double.parseDouble(t7.getText().toString()); 
		capture_flow_rate_u= Double.parseDouble(t8.getText().toString()); 
		capture_flow_rate_inc= Double.parseDouble(t9.getText().toString());
		capture_ph_l = Double.parseDouble(t10.getText().toString());
		capture_ph_u = Double.parseDouble(t11.getText().toString());
		capture_ph_inc = Double.parseDouble(t12.getText().toString()); 

		intermediate_binding_capacity_l= Double.parseDouble(t13.getText().toString()); 
		intermediate_binding_capacity_u= Double.parseDouble(t14.getText().toString());
		intermediate_binding_capacity_inc= Double.parseDouble(t15.getText().toString()); 
		intermediate_flow_rate_l= Double.parseDouble(t16.getText().toString());
		intermediate_flow_rate_u= Double.parseDouble(t17.getText().toString());
		intermediate_flow_rate_inc= Double.parseDouble(t18.getText().toString()); 
		intermediate_ph_l = Double.parseDouble(t19.getText().toString());
		intermediate_ph_u = Double.parseDouble(t20.getText().toString());
		intermediate_ph_inc = Double.parseDouble(t21.getText().toString());
		
		polishing_binding_capacity_l = Double.parseDouble(t22.getText().toString()); 
		polishing_binding_capacity_u = Double.parseDouble(t23.getText().toString()); 
		polishing_binding_capacity_inc = Double.parseDouble(t24.getText().toString()); 
		polishing_flow_rate_l = Double.parseDouble(t25.getText().toString()); 
		polishing_flow_rate_u = Double.parseDouble(t26.getText().toString()); 
		polishing_flow_rate_inc= Double.parseDouble(t27.getText().toString()); 	
		polishing_ph_l = Double.parseDouble(t28.getText().toString());
		polishing_ph_u = Double.parseDouble(t29.getText().toString());
		polishing_ph_inc = Double.parseDouble(t30.getText().toString());
		
		noc_capture_l = Double.parseDouble(t31.getText().toString()); 
		noc_capture_u = Double.parseDouble(t32.getText().toString());
		noc_intermediate_l = Double.parseDouble(t33.getText().toString()); 
		noc_intermediate_u = Double.parseDouble(t34.getText().toString()); 
		noc_polishing_l = Double.parseDouble(t35.getText().toString()); 
		noc_polishing_u = Double.parseDouble(t36.getText().toString());
		}
		catch(NumberFormatException e)
		{
			JOptionPane.showMessageDialog(this,"Invalid Input Format. Please enter a number as input","Invalid Input",JOptionPane.CLOSED_OPTION);
			System.exit(0);
		}
		
		//Finished reading all the input values
		
		/*
		//Block to test if all values have been read properly
		
		System.out.println(harvest_l);
		System.out.println(harvest_u);
		System.out.println(harvest_inc);
		System.out.println(capture_binding_capacity_l);
		System.out.println(capture_binding_capacity_u);
		System.out.println(capture_binding_capacity_inc);
		System.out.println(capture_flow_rate_l);
		System.out.println(capture_flow_rate_u);
		System.out.println(capture_flow_rate_inc);
		System.out.println(capture_ph_l);
		System.out.println(capture_ph_u);
		System.out.println(capture_ph_inc);
		System.out.println(intermediate_binding_capacity_l);
		System.out.println(intermediate_binding_capacity_u);
		System.out.println(intermediate_binding_capacity_inc);
		System.out.println(intermediate_flow_rate_l);
		System.out.println(intermediate_flow_rate_u);
		System.out.println(intermediate_flow_rate_inc);
		System.out.println(intermediate_ph_l);
		System.out.println(intermediate_ph_u);
		System.out.println(intermediate_ph_inc);
		System.out.println(polishing_binding_capacity_l);
		System.out.println(polishing_binding_capacity_u);
		System.out.println(polishing_binding_capacity_inc);
		System.out.println(polishing_flow_rate_l);
		System.out.println(polishing_flow_rate_u);
		System.out.println(polishing_flow_rate_inc);
		System.out.println(polishing_ph_l);
		System.out.println(polishing_ph_u);
		System.out.println(polishing_ph_inc);
		System.out.println(noc_capture_l);
		System.out.println(noc_capture_u);
		System.out.println(noc_intermediate_l);
		System.out.println(noc_intermediate_u);
		System.out.println(noc_polishing_l);
		System.out.println(noc_polishing_u);
		
		//End of test block
		*/
		
		
		//Declare required variables
		double step_yield_1 = 0.95;
		double harvest_volume= 1 ; 
		double upstream_product; // Product from the upstream process
		double product_1,product_c,product_i,product_f,product_p;
		double no_of_cycles_c,no_of_cycles_i,no_of_cycles_p;
		double i,j,k,l,m,n,o,p,q,r; // loop variables
		double total_process_yield;
		double total_process_time;
		double batches_per_year;
		double total_product;
		double sale_price = 100;
		double revenue;
		double no_of_cycles_y_c,no_of_cycles_y_i,no_of_cycles_y_p;
		double product_2,step_yield_5;
		double time1 = 168;
		
		//Variables to store the values of parameters that produce the maximum revenue
		double h_max=0; 
		double c_b_c_max=0; 
		double c_f_r_max=0;
		double c_ph_max=0; 
		double i_b_c_max=0; 
		double i_f_r_max=0;
		double i_ph_max=0; 
		double p_b_c_max=0; 
		double p_f_r_max=0;
		double p_ph_max=0;
		double revenue_max=0;
		double total_prod_max=0;
		
		
		/*try
		{	
		FileWriter fw = new FileWriter("/home/prateek2693/downstreamiterations.csv");
        	PrintWriter pw = new PrintWriter(fw);*/
        	
		
		
		//Step Process 1 - Centrifugation
		for(i=harvest_l ; i<=harvest_u ; i=i+harvest_inc)
		{
			upstream_product = harvest_volume * i;
			product_1 = upstream_product * step_yield_1;
			
			//Step Process 2 - Capture
			for(j=capture_binding_capacity_l ; j<=capture_binding_capacity_u ; j = j+capture_binding_capacity_inc) 
			{
				double resin_volume_c = 0.02;
				double load_conc_c =  product_1/harvest_volume; 
				double load_amount_c = j * resin_volume_c; 
				double load_volume_c = load_amount_c/load_conc_c; 
				no_of_cycles_c = product_1/load_amount_c;
				
				
				for(k=capture_flow_rate_l ; k<=capture_flow_rate_u ;k=k+capture_flow_rate_inc) 
				{
					double equilib_4cv_c = 4 * resin_volume_c/k; 
					double loading_c = load_volume_c/k; 
					double washing_c = 4*resin_volume_c/k; 
					double elution_3cv_c = 3*resin_volume_c/k; 
					double regeneration_2cv_c = 2*resin_volume_c/k; 
					double total_time_step_c = (equilib_4cv_c + loading_c + washing_c + elution_3cv_c + regeneration_2cv_c)*no_of_cycles_c;
					
					double step_yield_2; 
					
					for(l=capture_ph_l ; l<=capture_ph_u ; l = l + capture_ph_inc)
					{ 
						if (l<4)
							step_yield_2 = 0.65;
						else if (l>=4 && l<4.2)
							step_yield_2 = 0.71;
						else if (l>=4.2 && l<4.4)
							step_yield_2 = 0.82;
						else if (l>=4.4 && l<4.6)
							step_yield_2 = 0.95;
						else if (l>=4.6 && l<4.8)
							step_yield_2 = 0.86;
						else if (l>=4.8 && l<5)
							step_yield_2 = 0.77;
						else 
							step_yield_2 = 0.72;
							 
						product_2 = step_yield_2 * product_1;
						
						
						
						//Step Process 3 - Filtration
						double step_yield_3 = 0.95; 
						double product_3=product_2*step_yield_3;
						double product_conc=4; 
						double product_vol = product_3/product_conc; 
						double total_time_step_f = 3;

						
						// Step Process 4 - Intermediate
						double resin_volume_i = 0.02;
						for(m=intermediate_binding_capacity_l ; m<=intermediate_binding_capacity_u ; m=m+intermediate_binding_capacity_inc) 
						{
							double load_amount_i = resin_volume_i * m; 
							no_of_cycles_i = product_3 / load_amount_i;
							double load_volume_i = product_vol / no_of_cycles_i;
							
							
							for(n=intermediate_flow_rate_l ; n<=intermediate_flow_rate_u ; n=n+intermediate_flow_rate_inc)
							{
								
								double equilib_4cv_i = 4*resin_volume_i / n; 
								double loading_i = load_volume_i/n; 
								double washing_i = 4 * resin_volume_i / n; 
								double elution_10cv_i = 10 * resin_volume_i / n; 
								double regeneration_2cv_i = 2 * resin_volume_i / n; 
								double total_time_step_i = (equilib_4cv_i+loading_i+washing_i+elution_10cv_i+regeneration_2cv_i) * no_of_cycles_i;
								
								double step_yield_4=0.9; 
								/*if(l>=20 && l<=23) 
									step_yield_4=0.95; 
								if(l>23 && l<=26) 
									step_yield_4=0.90; 
								if(l>26 && l<=30) 
									step_yield_4=0.85;*/

								for(o=intermediate_ph_l ; o<=intermediate_ph_u ; o = o + intermediate_ph_inc)
								{
									if (o<4)
										step_yield_4 = 0.65;
									else if (o>=4 && o<4.2)
										step_yield_4 = 0.71;
									else if (o>=4.2 && o<4.4)
										step_yield_4 = 0.82;
									else if (o>=4.4 && o<4.6)
										step_yield_4 = 0.95;
									else if (o>=4.6 && o<4.8)
										step_yield_4 = 0.86;
									else if (o>=4.8 && o<5)
										step_yield_4 = 0.77;
									else 
										step_yield_4 = 0.72;
									
									double product_4=step_yield_4*product_3;
									double product_conc1=product_4/0.6; //0.6 =Total load volume
								
									//Step Process 5- Polishing
									double resin_volume_p = 0.02;
									for(p = polishing_binding_capacity_l ; p<=polishing_binding_capacity_u ; p = p + polishing_binding_capacity_inc)
									{
										double load_amount_p = resin_volume_p * p;
										no_of_cycles_p = product_4 / load_amount_p;
										double load_volume_p = load_amount_p/product_conc1;
										
									
										for(q=polishing_flow_rate_l ; q<=polishing_flow_rate_u ; q=q+polishing_flow_rate_inc)
										{
											double equilib_4cv_p = 4*resin_volume_p/q;
											double loading_p = load_volume_p/q; 
											double washing_p = 4*resin_volume_p/q; 
											double elution_10cv_p = 10*resin_volume_p/q; 
											double regeneration_2cv_p = 2*resin_volume_p/q; 
											double total_time_step_p = (equilib_4cv_p + loading_p + washing_p + elution_10cv_p + regeneration_2cv_p)*no_of_cycles_p;
											
										
											for(r=polishing_ph_l ; r<=polishing_ph_u ; r = r + polishing_ph_inc)
											{
												if (r<8)
													step_yield_5 = 0.65;
												else if (r>=8 && r<8.2)
													step_yield_5 = 0.71;
												else if (r>=8.2 && r<8.4)
													step_yield_5 = 0.82;
												else if (r>=8.4 && r<8.6)
													step_yield_5 = 0.95;
												else if (r>=8.6 && r<8.8)
													step_yield_5 = 0.86;
												else if (r>=8.8 && r<9)
													step_yield_5 = 0.77;
												else 
													step_yield_5 = 0.72;
												
												double product_5 = step_yield_5 * product_4;
												
												
												total_process_yield = product_5 / upstream_product; 
												total_process_time = total_time_step_p + total_time_step_i + total_time_step_c + total_time_step_f + time1; 
												batches_per_year = 365 * 24 / total_process_time; 
												total_product = product_5 * batches_per_year; 
												revenue = sale_price * total_product; 
												no_of_cycles_y_c = no_of_cycles_c * batches_per_year; 
												no_of_cycles_y_i = no_of_cycles_i * batches_per_year; 
												no_of_cycles_y_p = no_of_cycles_p * batches_per_year;
												
												//pw.println(i+",1"+j+","+k+","+l+","+m+","+n+","+o+","+p+","+q+","+r+","+product_5+","+total_process_time+","+batches_per_year+","+total_product+","+revenue);
												//pw.flush();
													
												if (no_of_cycles_y_c >= noc_capture_l && no_of_cycles_y_c<=noc_capture_u)
												{
													if(no_of_cycles_y_i >= noc_intermediate_l && no_of_cycles_y_i<=noc_intermediate_u)
													{
														if(no_of_cycles_y_p >= noc_polishing_l && no_of_cycles_y_p<=noc_polishing_u)
														{
															if (revenue>revenue_max)
															{
																h_max = i; 
																c_b_c_max = j; 
																c_f_r_max=k;
																c_ph_max=l; 
																i_b_c_max=m; 
																i_f_r_max=n;
																i_ph_max=o; 
																p_b_c_max=p; 
																p_f_r_max=q;
																p_ph_max=r;
																revenue_max=revenue;
																total_prod_max=total_product;
																
															}
														}
													}
												}
												
											}
											
										}
									
									}
									 
								
								}
							
							}
						
						}					
					
					}
				 
				}
			}
		
		}
		//Code to open the output window and print the results in the output window	
	JOptionPane.showMessageDialog(this,"Harvest: " + h_max +"\n Capture Binding Capacity: " + c_b_c_max + "\n Capture Flow Rate: " + c_f_r_max + "\n Capture pH: "+ c_ph_max+ "\n Intermediate Binding Capacity: "+ i_b_c_max + "\n Intermediate Flow Rate: " + i_f_r_max +"\n Intermediate pH: " + i_ph_max + "\n Polishing Binding Capacity: " + p_b_c_max+"\n Polishing Flow Rate: "+p_f_r_max+ "\n Polishing pH: " + p_ph_max+"\n Total product: " +total_prod_max +"\n Revenue: " + revenue_max,"RESULTS",JOptionPane.CLOSED_OPTION);
		/*pw.close();
		fw.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}*/
		
	
		
		
		
	
		
	}

	/*
	//For testing this class
	public static void main(String[] args)
	{
		InputtoOutput i1 = new InputtoOutput();
		i1.setSize(1000,1000);	
		i1.setVisible(true);
		i1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}*/

	

}
