package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private boolean isFollowed = false;
    private int num = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonLeft = (Button) findViewById(R.id.followButton);
        buttonLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isFollowed = !isFollowed;
                String buttonText = isFollowed ? "Unfollow" : "Follow";
                buttonLeft.setText(buttonText);
                String toastText = isFollowed ? "Followed" : "Unfollowed";
                Toast.makeText(getApplicationContext(), toastText, Toast.LENGTH_SHORT).show();
            }
        });
        Intent receivingEnd = getIntent();
        String Name = receivingEnd.getStringExtra("Name");
        String ID = Integer.toString(receivingEnd.getIntExtra("ID", 0));
        String Text = Name + " " + ID;
        TextView tv = (TextView) findViewById(R.id.nameTextView);
        tv.setText(Text);
    }
}

