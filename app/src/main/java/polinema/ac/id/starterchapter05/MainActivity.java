package polinema.ac.id.starterchapter05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment checkPushupFragment=getSupportFragmentManager().findFragmentById(R.id.fragment_placeholder);

        if(checkPushupFragment==null || checkPushupFragment instanceof DipsFragment || checkPushupFragment instanceof HandstandFragment){
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.fragment_placeholder,new PushUpsFragment());
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerPushup(View view) {
        Fragment checkPushupFragment=getSupportFragmentManager().findFragmentById(R.id.fragment_placeholder);

        if(checkPushupFragment==null || checkPushupFragment instanceof DipsFragment || checkPushupFragment instanceof HandstandFragment){
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.fragment_placeholder,new PushUpsFragment());
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerDips(View view) {
        Fragment checkDipFragment=getSupportFragmentManager().findFragmentById(R.id.fragment_placeholder);

        if(checkDipFragment==null || checkDipFragment instanceof PushUpsFragment || checkDipFragment instanceof HandstandFragment){
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.fragment_placeholder,new DipsFragment());
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerHandstand(View view) {
        Fragment checkHandStandFragment=getSupportFragmentManager().findFragmentById(R.id.fragment_placeholder);

        if(checkHandStandFragment==null || checkHandStandFragment instanceof PushUpsFragment || checkHandStandFragment instanceof DipsFragment){
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.fragment_placeholder,new HandstandFragment());
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
