package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mStoryTextView;
    private Button mTopButton;
    private Button mBottomButton;

    private int mStoryIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStoryIndex = 1;

        mStoryTextView = findViewById(R.id.storyTextView);
        mTopButton = findViewById(R.id.buttonTop);
        mBottomButton = findViewById(R.id.buttonBottom);

        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) mStoryIndex = 3;
                else if (mStoryIndex == 2) mStoryIndex = 3;
                else if (mStoryIndex == 3) mStoryIndex = 6;
                updateUI();
            }
        });

        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) mStoryIndex = 2;
                else if (mStoryIndex == 2) mStoryIndex = 4;
                else if (mStoryIndex == 3) mStoryIndex = 5;
                updateUI();
            }
        });
    }

    private void updateUI() {
        switch (mStoryIndex) {
            case 1:
                mStoryTextView.setText(R.string.T1_Story);
                mTopButton.setText(R.string.T1_Ans1);
                mBottomButton.setText(R.string.T1_Ans2);
                break;
            case 2:
                mStoryTextView.setText(R.string.T2_Story);
                mTopButton.setText(R.string.T2_Ans1);
                mBottomButton.setText(R.string.T2_Ans2);
                break;
            case 3:
                mStoryTextView.setText(R.string.T3_Story);
                mTopButton.setText(R.string.T3_Ans1);
                mBottomButton.setText(R.string.T3_Ans2);
                break;
            case 4:
                mStoryTextView.setText(R.string.T4_End);
                mTopButton.setVisibility(View.GONE);
                mBottomButton.setVisibility(View.GONE);
                break;
            case 5:
                mStoryTextView.setText(R.string.T5_End);
                mTopButton.setVisibility(View.GONE);
                mBottomButton.setVisibility(View.GONE);
                break;
            case 6:
                mStoryTextView.setText(R.string.T6_End);
                mTopButton.setVisibility(View.GONE);
                mBottomButton.setVisibility(View.GONE);
                break;
        }
    }
}
