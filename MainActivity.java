package ma.ensaf.newcalc;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
//importer la bibliotheque exp4j
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    String expresion="";

      TextView resultat,operation;
      MaterialButton btnAC,btnouvre,btnferme,btndiv,btnfois,btnmois,btnplus,btnequal;
    MaterialButton  btn7,btn8,btn6,btn5,btn4,btn3,btn2,btn1,btn0,btnpoi,btn9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        resultat=findViewById(R.id.resultat);
      operation=findViewById(R.id.operation);
        btnAC=findViewById(R.id.AC);
        btnouvre=findViewById(R.id.ouvre);
        btnferme=findViewById(R.id.ferme);
        btndiv=findViewById(R.id.div);
        btnfois=findViewById(R.id.fois);
        btnmois=findViewById(R.id.mois);
        btnplus=findViewById(R.id.plus);
        btnequal=findViewById(R.id.egale);
        btn7=findViewById(R.id.n7);
        btn6=findViewById(R.id.n6);
        btn5=findViewById(R.id.n5);
        btn4=findViewById(R.id.n4);
        btn3=findViewById(R.id.n3);
        btn2=findViewById(R.id.n2);
        btn1=findViewById(R.id.n1);
        btn0=findViewById(R.id.n0);
        btn8=findViewById(R.id.n8);
        btn9=findViewById(R.id.n9);
        btnpoi=findViewById(R.id.virgule);



         btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              expresion="";
               operation.setText(expresion);
               resultat.setText("");
            }
        });
        btnouvre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expresion= btnouvre.getText().toString();
                operation.setText(expresion);
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expresion= expresion+btndiv.getText().toString();

                operation.setText(expresion);
            }
        });
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expresion+=btnplus.getText().toString();

                operation.setText(expresion);
            }
        });
        btnfois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expresion+= btnfois.getText().toString();
                operation.setText(expresion);
            }
        });
        btnmois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expresion+= btnmois.getText().toString();
                operation.setText(expresion);
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Expression expression = new ExpressionBuilder(expresion).build();
                    double resulta = expression.evaluate();
                    resultat.setText(String.valueOf((int) resulta));
                } catch (Exception exp){
                               resultat.setText("erur");
                }





            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expresion+= btn0.getText().toString();
                operation.setText(expresion);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expresion+= btn1.getText().toString();
                operation.setText(expresion);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expresion+= btn2.getText().toString();
                operation.setText(expresion);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expresion+= btn3.getText().toString();
                operation.setText(expresion);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expresion+= btn4.getText().toString();
                operation.setText(expresion);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expresion+= btn5.getText().toString();
                operation.setText(expresion);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expresion+= btn6.getText().toString();
                operation.setText(expresion);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expresion+= btn7.getText().toString();
                operation.setText(expresion);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expresion+= btn8.getText().toString();
                operation.setText(expresion);
            }
        });
        btnpoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expresion+= btnpoi.getText().toString();
                operation.setText(expresion);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expresion+= btn9.getText().toString();
                operation.setText(expresion);
            }
        });




    }
}