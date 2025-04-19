import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.font.TextAttribute;
import java.text.ListFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.font.TextAttribute;
import java.lang.classfile.Attribute;
import java.net.PasswordAuthentication;

import javax.swing.text.AttributeSet;

import java.util.HashMap;
import java.util.Map;



    public class variaschecks extends JFrame {

    

    private final  JTextField textField;
    private final JCheckBox boldJCheckBox;
    private final  JCheckBox italicJCheckBox;
    private final  JCheckBox sublinhadoJCheckBox;
    private  final JCheckBox tachadoJCheckBox;
     private final JCheckBox alignCenterbox;
      private final  JCheckBox alignLeftbox; 
       private  final JCheckBox  alignBottombox;
        private  final JCheckBox aligntopbox;
        private  final JCheckBox alignRightBox;
        private final JCheckBox trocacor1;
        private final JCheckBox trocacor2;
        private final JCheckBox trocacor3;
        private final JCheckBox trocafonte;
        private final  JCheckBox trocafonte2;

    public variaschecks(){

        super("Teste da checkbox");
        setLayout(new FlowLayout());

        textField = new JTextField("Veja a mudança do estilo de fonte", 20);
        textField.setPreferredSize(new Dimension(200,300));
        textField.setFont(new Font("Serif", Font.PLAIN, 17));
        add(textField);



        boldJCheckBox = new JCheckBox("Negrito");
        italicJCheckBox = new JCheckBox("Italico");
        sublinhadoJCheckBox = new JCheckBox("Sublinhado");
       tachadoJCheckBox = new JCheckBox("Tachado");
        add(boldJCheckBox);
        add(italicJCheckBox);
        add(sublinhadoJCheckBox);
        add(tachadoJCheckBox);


          alignCenterbox = new JCheckBox("Alinhar pro centro");
         alignRightBox  = new JCheckBox("Alinhar pra direita");
          alignLeftbox = new JCheckBox("Alinhar pra esquerda");
          alignBottombox = new JCheckBox("Alinhar pra baixo");
          aligntopbox  = new JCheckBox("Alinhar pra cima");
            trocacor1 = new JCheckBox("Cor vermelha");
            trocacor2 = new JCheckBox("Mudar cor verde");
            trocacor3 = new JCheckBox("Mudar cor azul");
            trocafonte = new JCheckBox("Mudar fonte para Arial");
            trocafonte2 = new JCheckBox("Mudar fonte para Times new Roman");
            add(alignCenterbox);
            add(alignRightBox);
            add(alignLeftbox);
            add(alignBottombox);
            add(aligntopbox);
            add(trocacor1);
            add(trocacor2);
            add(trocacor3);
            add(trocafonte);
            add(trocafonte2);

            




        CheckBoxHandler TESTALOGO = new CheckBoxHandler();

        boldJCheckBox.addItemListener(TESTALOGO);
        italicJCheckBox.addItemListener(TESTALOGO);
        sublinhadoJCheckBox.addItemListener(TESTALOGO);
        tachadoJCheckBox.addItemListener(TESTALOGO);
        alignBottombox.addItemListener(TESTALOGO);
        alignCenterbox.addItemListener(TESTALOGO);
        alignRightBox.addItemListener(TESTALOGO);
        alignLeftbox.addItemListener(TESTALOGO);
        aligntopbox.addItemListener(TESTALOGO);
        trocacor1.addItemListener(TESTALOGO);
        trocacor2.addItemListener(TESTALOGO);
        trocacor3.addItemListener(TESTALOGO);
        trocafonte.addItemListener(TESTALOGO);
        trocafonte2.addItemListener(TESTALOGO);




    }

    private class CheckBoxHandler implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent eventin) {  
    
            int estilizando = Font.PLAIN;  
            if (boldJCheckBox.isSelected() && italicJCheckBox.isSelected()) {
                estilizando = Font.BOLD + Font.ITALIC;
            } else if(italicJCheckBox.isSelected()){
                estilizando = Font.ITALIC;
            } else if(boldJCheckBox.isSelected()){
                estilizando = Font.BOLD;
            }
                  Font baseFont = new Font("Serif", estilizando, 17);
            Map<TextAttribute, Object>  passa = new HashMap<>(baseFont.getAttributes());

             if (sublinhadoJCheckBox.isSelected()){
                  passa.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
            
            } 
            
            if (tachadoJCheckBox.isSelected()){
                passa.put(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON);

            }


            Font novafont = new Font(passa);
            textField.setFont(novafont);

                if(alignCenterbox.isSelected()){
                    textField.setHorizontalAlignment(JTextField.CENTER);
                } else if(alignLeftbox.isSelected()){
                    textField.setHorizontalAlignment(JTextField.LEFT);
                } else if(alignRightBox.isSelected()){
                    textField.setHorizontalAlignment(JTextField.RIGHT);
                }else if(aligntopbox.isSelected()){
                    textField.setHorizontalAlignment(JTextField.TOP);
                } else if(alignBottombox.isSelected()){
                    textField.setHorizontalAlignment(JTextField.BOTTOM);
                }

                Color color = Color.BLACK;

                if(trocacor1.isSelected()){
                    color = Color.RED;
                } else if(trocacor2.isSelected()){
                    color = Color.GREEN;

                } else if(trocacor3.isSelected()){
                    color = Color.BLUE;
                    
                }

                    textField.setForeground(color);
            

                if(trocafonte.isSelected()){
                    Font fontedetexto = new Font("Arial", estilizando, 17);
                        textField.setFont(fontedetexto);

                }

                if(trocafonte2.isSelected()){
                    Font fontedetexto2 = new Font("Times New Roman", estilizando, 17);
                    textField.setFont(fontedetexto2);
                }
                

        }
    }
}