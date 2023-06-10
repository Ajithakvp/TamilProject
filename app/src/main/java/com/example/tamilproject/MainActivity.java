package com.example.tamilproject;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    CardView cv1,cv2,cv3,cv4,cv5,cv6,cv7,cv8,cv9,cv10,cv11,cv12;
    ImageView ivView;
    Random random;
    final int []imageArray=
            {R.drawable.t1,R.drawable.t2,R.drawable.t3,R.drawable.t4,R.drawable.t5,
                    R.drawable.t6,R.drawable.t7,R.drawable.t8,R.drawable.t9,R.drawable.t10,
                    R.drawable.t11,R.drawable.t12};
    String imgName;
    MediaPlayer wrong;
    MediaPlayer crt;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cv1=findViewById(R.id.cv1);
        cv2=findViewById(R.id.cv2);
        cv3=findViewById(R.id.cv3);
        cv4=findViewById(R.id.cv4);
        cv5=findViewById(R.id.cv5);
        cv6=findViewById(R.id.cv6);
        cv7=findViewById(R.id.cv7);
        cv8=findViewById(R.id.cv8);
        cv9=findViewById(R.id.cv9);
        cv10=findViewById(R.id.cv10);
        cv11=findViewById(R.id.cv11);
        cv12=findViewById(R.id.cv12);
        ivView=findViewById(R.id.ivView);
        callButton();
         wrong = MediaPlayer.create(this, R.raw.wrong);
          crt = MediaPlayer.create(this, R.raw.crt);
        random=new Random();
        ivView.setImageResource(imageArray[random.nextInt(imageArray.length)]);
        nextImage();
        //int id = res.getIdentifier(, "drawable", getPackageName());

//        final Handler handler = new Handler();
//        Runnable runnable = new Runnable() {
//            int i=0;
//            public void run() {
//                ivView.setImageResource(imageArray[i]);
//                i++;
//                if(i>imageArray.length-1)
//                {
//                    i=0;
//                }
//                handler.postDelayed(this, 5000);
//            }
//
//        };
//        handler.postDelayed(runnable, 5000);





    }

    private void callButton() {

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgName.startsWith("t1")&& v.getId()==R.id.cv1) {
                    crt.start();
                    nextImage();
                }else {
                    Toast.makeText(MainActivity.this, "மீண்டும் முயற்சி செய்", Toast.LENGTH_SHORT).show();
                    wrong.start();
                    Log.e(TAG, "onClick: "+imgName.startsWith("t1")+" id" + v.getId()+"R -id"+R.id.cv1);
                    Dialog dialog=new Dialog(MainActivity.this);
                    dialog.setContentView(R.layout.dialog);
                    dialog.setCancelable(false);
                    dialog.show();
                    Button btn=dialog.findViewById(R.id.btn);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });



                }
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgName.startsWith("t2")&& v.getId()==R.id.cv2) {
                    crt.start();
                    nextImage();
                }else {
                    wrong.start();
                    Toast.makeText(MainActivity.this, "மீண்டும் முயற்சி செய்", Toast.LENGTH_SHORT).show();
                    Log.e(TAG, "onClick: "+imgName.startsWith("t2")+" id" + v.getId()+"R -id"+R.id.cv2);
                    Dialog dialog=new Dialog(MainActivity.this);
                    dialog.setContentView(R.layout.dialog);
                    dialog.setCancelable(false);
                    dialog.show();
                    Button btn=dialog.findViewById(R.id.btn);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });
                }
            }
        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgName.startsWith("t3")&& v.getId()==R.id.cv3) {
                    crt.start();
                    nextImage();
                }else {
                    wrong.start();
                    Toast.makeText(MainActivity.this, "மீண்டும் முயற்சி செய்", Toast.LENGTH_SHORT).show();
                    Log.e(TAG, "onClick: "+imgName.startsWith("t3")+" id" + v.getId()+"R -id"+R.id.cv3);
                    Dialog dialog=new Dialog(MainActivity.this);
                    dialog.setContentView(R.layout.dialog);
                    dialog.setCancelable(false);
                    dialog.show();
                    Button btn=dialog.findViewById(R.id.btn);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });
                }
            }
        });

        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgName.startsWith("t4")&& v.getId()==R.id.cv4) {
                    crt.start();
                    nextImage();
                }else {
                    wrong.start();
                    Toast.makeText(MainActivity.this, "மீண்டும் முயற்சி செய்", Toast.LENGTH_SHORT).show();
                    Log.e(TAG, "onClick: "+imgName.startsWith("t4")+" id" + v.getId()+"R -id"+R.id.cv4);
                    Dialog dialog=new Dialog(MainActivity.this);
                    dialog.setContentView(R.layout.dialog);
                    dialog.setCancelable(false);
                    dialog.show();
                    Button btn=dialog.findViewById(R.id.btn);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });
                }
            }
        });


        cv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgName.startsWith("t5")&& v.getId()==R.id.cv5) {
                    crt.start();
                    nextImage();
                }else {
                    wrong.start();
                    Toast.makeText(MainActivity.this, "மீண்டும் முயற்சி செய்", Toast.LENGTH_SHORT).show();
                    Log.e(TAG, "onClick: "+imgName.startsWith("t5")+" id" + v.getId()+"R -id"+R.id.cv5);
                    Dialog dialog=new Dialog(MainActivity.this);
                    dialog.setContentView(R.layout.dialog);
                    dialog.setCancelable(false);
                    dialog.show();
                    Button btn=dialog.findViewById(R.id.btn);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });
                }
            }
        });

        cv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgName.startsWith("t6")&& v.getId()==R.id.cv6) {
                    crt.start();
                    nextImage();
                }else {
                    wrong.start();
                    Toast.makeText(MainActivity.this, "மீண்டும் முயற்சி செய்", Toast.LENGTH_SHORT).show();
                    Log.e(TAG, "onClick: "+imgName.startsWith("t6")+" id" + v.getId()+"R -id"+R.id.cv6);
                    Dialog dialog=new Dialog(MainActivity.this);
                    dialog.setContentView(R.layout.dialog);
                    dialog.setCancelable(false);
                    dialog.show();
                    Button btn=dialog.findViewById(R.id.btn);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });
                }
            }
        });

        cv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgName.startsWith("t7")&& v.getId()==R.id.cv7) {
                    crt.start();
                    nextImage();
                }else {
                    wrong.start();
                    Toast.makeText(MainActivity.this, "மீண்டும் முயற்சி செய்", Toast.LENGTH_SHORT).show();
                    Log.e(TAG, "onClick: "+imgName.startsWith("t7")+" id" + v.getId()+"R -id"+R.id.cv7);
                    Dialog dialog=new Dialog(MainActivity.this);
                    dialog.setContentView(R.layout.dialog);
                    dialog.setCancelable(false);
                    dialog.show();
                    Button btn=dialog.findViewById(R.id.btn);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });
                }
            }
        });

        cv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgName.startsWith("t8")&& v.getId()==R.id.cv8) {
                    crt.start();
                    nextImage();
                }else {
                    wrong.start();
                    Toast.makeText(MainActivity.this, "மீண்டும் முயற்சி செய்", Toast.LENGTH_SHORT).show();
                    Log.e(TAG, "onClick: "+imgName.startsWith("t8")+" id" + v.getId()+"R -id"+R.id.cv8);
                    Dialog dialog=new Dialog(MainActivity.this);
                    dialog.setContentView(R.layout.dialog);
                    dialog.setCancelable(false);
                    dialog.show();
                    Button btn=dialog.findViewById(R.id.btn);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });
                }
            }
        });

        cv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgName.startsWith("t9")&& v.getId()==R.id.cv9) {
                    crt.start();
                    nextImage();
                }else {
                    wrong.start();
                    Toast.makeText(MainActivity.this, "மீண்டும் முயற்சி செய்", Toast.LENGTH_SHORT).show();
                    Log.e(TAG, "onClick: "+imgName.startsWith("t9")+" id" + v.getId()+"R -id"+R.id.cv9);
                    Dialog dialog=new Dialog(MainActivity.this);
                    dialog.setContentView(R.layout.dialog);
                    dialog.setCancelable(false);
                    dialog.show();
                    Button btn=dialog.findViewById(R.id.btn);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });
                }
            }
        });

        cv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgName.startsWith("t10")&& v.getId()==R.id.cv10) {
                    crt.start();
                    nextImage();
                }else {
                    wrong.start();
                    Toast.makeText(MainActivity.this, "மீண்டும் முயற்சி செய்", Toast.LENGTH_SHORT).show();
                    Log.e(TAG, "onClick: "+imgName.startsWith("t10")+" id" + v.getId()+"R -id"+R.id.cv10);
                    Dialog dialog=new Dialog(MainActivity.this);
                    dialog.setContentView(R.layout.dialog);
                    dialog.setCancelable(false);
                    dialog.show();
                    Button btn=dialog.findViewById(R.id.btn);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });
                }
            }
        });

        cv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgName.startsWith("t11")&& v.getId()==R.id.cv11) {
                    crt.start();
                    nextImage();
                }else {
                    wrong.start();
                    Log.e(TAG, "onClick: "+imgName.startsWith("t11")+" id" + v.getId()+"R -id"+R.id.cv11);
                    Toast.makeText(MainActivity.this, "மீண்டும் முயற்சி செய்", Toast.LENGTH_SHORT).show();
                    Dialog dialog=new Dialog(MainActivity.this);
                    dialog.setContentView(R.layout.dialog);
                    dialog.setCancelable(false);
                    dialog.show();
                    Button btn=dialog.findViewById(R.id.btn);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });
                }
            }
        });

        cv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imgName.startsWith("t12")&& v.getId()==R.id.cv12) {
                    crt.start();
                    nextImage();
                }else {
                    wrong.start();
                    Toast.makeText(MainActivity.this, "மீண்டும் முயற்சி செய்", Toast.LENGTH_SHORT).show();
                    Log.e(TAG, "onClick: "+imgName.startsWith("t12")+" id" + v.getId()+"R -id"+R.id.cv12);
                    Dialog dialog=new Dialog(MainActivity.this);
                    dialog.setContentView(R.layout.dialog);
                    dialog.setCancelable(false);
                    dialog.show();
                    Button btn=dialog.findViewById(R.id.btn);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });
                }
            }
        });
    }

    private void nextImage() {
        int rndN = random.nextInt(imageArray.length)+1;
         imgName =  "t"+rndN;
        Log.e(TAG, "nextImage: "+imgName );
        Resources res = getResources();
        int id = res.getIdentifier(imgName, "drawable", getPackageName());
        Log.e(TAG, "id: "+id);
        ivView.setImageResource(id);

    }


}