package com.example.erand.tic_tac_toe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Player extends AppCompatActivity {
    int quantity = 0;
    Button firstButton;
    Button secondButton;
    Button thirdButton;
    Button fourthButton;
    Button fifthButton;
    Button sixthButton;
    Button seventhButton;
    Button eighthButton;
    Button ninthButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player);
        Button backButton = findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });

        board();
        incrementOne();
        incrementTwo();
        b1();
        b2();
        b3();
        b4();
        b5();
        b6();
        b7();
        b8();
        b9();

    }

    public void b1() {
        firstButton = findViewById(R.id.one);
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean b1 = true;
                if (b1) {
                    firstButton.setText("X");
                }
                firstButton.setEnabled(false);
            }

        });
    }

    public void b2() {
        secondButton = findViewById(R.id.two);
        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean b2 = true;
                if (b2) {
                    secondButton.setText("X");
                }
                secondButton.setEnabled(false);
            }


        });
    }

    public void b3() {
        thirdButton = findViewById(R.id.three);
        thirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean b3 = true;
                if (b3) {
                    thirdButton.setText("X");
                }
                thirdButton.setEnabled(false);
            }

        });

    }

    public void b4() {
        fourthButton = findViewById(R.id.four);
        fourthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean b4 = true;
                if (b4) {
                    fourthButton.setText("O");
                }
                fourthButton.setEnabled(false);
            }

        });

    }

    public void b5() {
        fifthButton = findViewById(R.id.five);
        fifthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean b5 = true;
                if (b5) {
                    fifthButton.setText("O");
                }
                fifthButton.setEnabled(false);
            }
        });

    }

    public void b6() {
        sixthButton = findViewById(R.id.six);
        sixthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean b6 = true;
                if (b6) {
                    sixthButton.setText("O");
                }
                sixthButton.setEnabled(false);
            }
        });

    }


    public void b7() {
        seventhButton = findViewById(R.id.seven);
        seventhButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean b7 = true;
                if (b7) {
                    seventhButton.setText("X");
                }
                seventhButton.setEnabled(false);
            }
        });

    }

    public void b8() {
        eighthButton = findViewById(R.id.eight);
        eighthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean b8 = true;
                if (b8) {
                    eighthButton.setText("O");
                }
                eighthButton.setEnabled(false);
            }
        });


    }

    public void b9() {
        ninthButton = findViewById(R.id.nine);
        ninthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean b9 = true;
                if (b9) {
                    ninthButton.setText("X");
                }
                ninthButton.setEnabled(false);
            }

        });
    }

    public void board(){
    }


    //This method updates the score of player1 by one
    private void score(int value) {
        TextView quantityTextView = findViewById(R.id.score1);
        quantityTextView.setText("" + value);

    }

    /**
     * This method displays the player1 score on the screen
     */

    public void incrementOne() {
        quantity = quantity + 1;
        score(quantity);

    }

    /**
     * This method displays the player2 score on the screen
     */

    public void incrementTwo() {
        quantity = quantity + 1;
        score(quantity);

    }

}