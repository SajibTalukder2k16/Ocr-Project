package com.example.sajib.ocr_mine;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.text.TextBlock;
import com.google.android.gms.vision.text.TextRecognizer;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class SampleTryOCR extends AppCompatActivity  {
    ImageView imageButton;
    TextView textView;
    public Bitmap bmp;
    private static final int REQUEST_CODE = 1;
    private static int RESULT_LOAD_IMG = 1;
    private Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_try_ocr);

        textView = (TextView) findViewById(R.id.id_for_text);
        imageButton = (ImageView) findViewById(R.id.id_for_img);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getImageFromAlbum();
            }
        });

    }
    private void getImageFromAlbum() {
        Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
        photoPickerIntent.setType("image/*");
        startActivityForResult(photoPickerIntent, RESULT_LOAD_IMG);
    }


    @Override
    protected void onActivityResult(int reqCode, int resultCode, Intent data) {
        super.onActivityResult(reqCode, resultCode, data);


        if (resultCode == RESULT_OK) {
            try {
                final Uri imageUri = data.getData();
                final InputStream imageStream = getContentResolver().openInputStream(imageUri);
                final Bitmap selectedImage = BitmapFactory.decodeStream(imageStream);
                imageButton.setImageBitmap(selectedImage);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                Toast.makeText(this, "Something went wrong", Toast.LENGTH_LONG).show();
            }

        }else {
            Toast.makeText(this, "You haven't picked Image",Toast.LENGTH_LONG).show();
        }
    }
    public void getTextfromImage(View v)
    {
        /// textView.setText("Sajib");
        Bitmap bitmap=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.id.id_for_img);
        //Bitmap bitmap=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.id.id_for_img);
        TextRecognizer textRecognizer=new TextRecognizer.Builder(getApplicationContext()).build();
        if(!textRecognizer.isOperational())
        {
            Toast.makeText(getApplicationContext(),"Could not got the text",Toast.LENGTH_SHORT).show();

        }
        else
        {
            Frame frame=new Frame.Builder().setBitmap(bitmap).build();
            SparseArray<TextBlock> items=textRecognizer.detect(frame);
            StringBuilder stringBuilder = new StringBuilder();
            for(int i=0;i<items.size();i++){
                TextBlock item = items.valueAt(i);
                stringBuilder.append(item.getValue());
                stringBuilder.append("\n");
            }
            textView.setText(stringBuilder.toString());
        }
    }
}
