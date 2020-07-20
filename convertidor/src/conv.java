import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

public class conv {
    private JPanel principal;
    private JComboBox cmb1;
    private JComboBox cmb2;
    private JComboBox cmb3;
    private JButton button;
    private JTextField txt;
    private JTextField txt2;
    private ArrayList<tipo> tipos= new ArrayList<>();

    public static void main(String[] args) {
        JFrame app = new JFrame();
        app.setContentPane(new conv().principal);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.pack();
        app.setVisible(true);
    }
    public conv(){
        tipos.add(new tipo("Peso",1));
        tipos.add(new tipo("Distancia",2));
        tipos.add(new tipo("Temperatura",3));

        tipos.get(0).conversiones.add(new Conversion("Onzas",28.35f,0));
        tipos.get(0).conversiones.add(new Conversion("Mililitros",1f,0));
        tipos.get(0).conversiones.add(new Conversion("Miligramos",0.001f,0));
        tipos.get(0).conversiones.add(new Conversion("Gramos",1f,0));
        tipos.get(0).conversiones.add(new Conversion("Kilogramos",1000f,0));

        tipos.get(1).conversiones.add(new Conversion("Metros",1f,0));
        tipos.get(1).conversiones.add(new Conversion("Pulgadas",1/39.37f,0));
        tipos.get(1).conversiones.add(new Conversion("Kilometro",100f,0));

        tipos.get(2).conversiones.add(new Conversion("Celsius",9/5f,1));
        tipos.get(2).conversiones.add(new Conversion("Farenheit",5/9f,2));
        tipos.get(2).conversiones.add(new Conversion("Kelvin",-273.15f,3));

        tipos.get(0).conversiones.get(0).conversiones2.add(new Conversion2("Mililitros",1f,0));
        tipos.get(0).conversiones.get(0).conversiones2.add(new Conversion2("Miligramos",1000f,0));
        tipos.get(0).conversiones.get(0).conversiones2.add(new Conversion2("Gramos",1f,0));
        tipos.get(0).conversiones.get(0).conversiones2.add(new Conversion2("Kilogramos",0.001f,0));

        tipos.get(0).conversiones.get(1).conversiones2.add(new Conversion2("Onzas",1/28.3495f,0));
        tipos.get(0).conversiones.get(1).conversiones2.add(new Conversion2("Miligramos",1000f,0));
        tipos.get(0).conversiones.get(1).conversiones2.add(new Conversion2("Gramos",1f,0));
        tipos.get(0).conversiones.get(1).conversiones2.add(new Conversion2("Kilogramos",0.001f,0));

        tipos.get(0).conversiones.get(2).conversiones2.add(new Conversion2("Mililitros",1f,0));
        tipos.get(0).conversiones.get(2).conversiones2.add(new Conversion2("Onzas",1/28.3495f,0));
        tipos.get(0).conversiones.get(2).conversiones2.add(new Conversion2("Gramos",1f,0));
        tipos.get(0).conversiones.get(2).conversiones2.add(new Conversion2("Kilogramos",0.001f,0));

        tipos.get(0).conversiones.get(3).conversiones2.add(new Conversion2("Mililitros",1f,0));
        tipos.get(0).conversiones.get(3).conversiones2.add(new Conversion2("Onzas",1/28.3495f,0));
        tipos.get(0).conversiones.get(3).conversiones2.add(new Conversion2("Miligramos",1000f,0));
        tipos.get(0).conversiones.get(3).conversiones2.add(new Conversion2("Kilogramos",0.001f,0));

        tipos.get(0).conversiones.get(4).conversiones2.add(new Conversion2("Mililitros",1f,0));
        tipos.get(0).conversiones.get(4).conversiones2.add(new Conversion2("Onzas",1/28.3495f,0));
        tipos.get(0).conversiones.get(4).conversiones2.add(new Conversion2("Miligramos",1000f,0));
        tipos.get(0).conversiones.get(4).conversiones2.add(new Conversion2("Gramos",1f,0));


        tipos.get(1).conversiones.get(0).conversiones2.add(new Conversion2("Pulgadas",39.37f,0));
        tipos.get(1).conversiones.get(0).conversiones2.add(new Conversion2("Kilometro",0.001f,0));

        tipos.get(1).conversiones.get(1).conversiones2.add(new Conversion2("Metros",1f,0));
        tipos.get(1).conversiones.get(1).conversiones2.add(new Conversion2("Kilometro",0.001f,0));

        tipos.get(1).conversiones.get(2).conversiones2.add(new Conversion2("Metros",1f,0));
        tipos.get(1).conversiones.get(2).conversiones2.add(new Conversion2("Pulgadas",39.37f,0));

        tipos.get(2).conversiones.get(0).conversiones2.add(new Conversion2("Farenheit",32f,1));
        tipos.get(2).conversiones.get(0).conversiones2.add(new Conversion2("Kelvin",273.15f,2));

        tipos.get(2).conversiones.get(1).conversiones2.add(new Conversion2("Celsius",-32f,1));
        tipos.get(2).conversiones.get(1).conversiones2.add(new Conversion2("Kelvin",273.15f,2));

        tipos.get(2).conversiones.get(2).conversiones2.add(new Conversion2("Celsius",-32f,1));
        tipos.get(2).conversiones.get(2).conversiones2.add(new Conversion2("Farenheit",32f,2));


        DefaultComboBoxModel cmbx1 = new DefaultComboBoxModel();
        cmbx1.addAll(tipos);
        cmb1.setModel(cmbx1);

        cmb1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                if(itemEvent.getStateChange() == itemEvent.SELECTED){
                    tipo seleccion = (tipo) cmb1.getSelectedItem();
                    DefaultComboBoxModel cmbx2 = new DefaultComboBoxModel();
                    cmbx2.addAll(seleccion.conversiones);
                    cmb2.setModel(cmbx2);
                }
            }
        });
        cmb2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                if(itemEvent.getStateChange() == itemEvent.SELECTED){
                    Conversion seleccion2 = (Conversion) cmb2.getSelectedItem();
                    DefaultComboBoxModel cmbx3 = new DefaultComboBoxModel();
                    cmbx3.addAll(seleccion2.conversiones2);
                    cmb3.setModel(cmbx3);
                }
            }
        });
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(cmb3.getSelectedItem() != null){
                    Conversion seleccion2 = (Conversion) cmb2.getSelectedItem();
                    Conversion2 seleccion3 = (Conversion2) cmb3.getSelectedItem();
                    tipo seleccion = (tipo) cmb1.getSelectedItem();
                    float conv = seleccion2.num;
                    float suma = seleccion3.sum;
                    if (txt.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null,"Porfavor introduzca un número.");
                        return;
                    }
                    float valorfinal = 0f;
                    try{ float valor = Float.parseFloat(txt.getText());
                        int idx = seleccion2.idx;
                        if(seleccion.idx == 3) {
                            switch(idx){
                                case 1:if(seleccion3.idx == 1) {valorfinal= (valor*conv) + suma;}else{valorfinal= valor+suma;}break;
                                case 2:valorfinal = (valor - 32)*conv; if(seleccion3.idx == 2){valorfinal = valorfinal + suma; }break;
                                case 3:valorfinal=valor - 273.15f;if(seleccion3.idx ==2){valorfinal=(valorfinal-suma)*conv;}
                            }
                        }else {valorfinal = valor * conv * suma;}
                        txt2.setText(Float.toString(valorfinal));
                    }catch (Exception e){
                            JOptionPane.showMessageDialog(null, "Valor inválido.");
                    }
                }
            }
        });
    }
}