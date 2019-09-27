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

        Fragment checkPushupFragment=getSupportFragmentManager().findFragmentByTag("PUSHUP_FRAGMENT");

        if(checkPushupFragment!=null && checkPushupFragment.isVisible()){

        }else{
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.fragment_placeholder,new PushUpsFragment(),"PUSHUP_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerPushup(View view) {
        Fragment checkPushUpFragment=getSupportFragmentManager().findFragmentByTag("PUSHUP_FRAGMENT");

        if(checkPushUpFragment!=null && checkPushUpFragment.isVisible()){

        }else{
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.fragment_placeholder,new PushUpsFragment(),"PUSHUP_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerDips(View view) {
        Fragment checkDipFragment=getSupportFragmentManager().findFragmentByTag("DIP_FRAGMENT");

        if(checkDipFragment!=null && checkDipFragment.isVisible()){

        }else{
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.fragment_placeholder,new DipsFragment(),"DIP_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerHandstand(View view) {
        Fragment checkHandStandFragment=getSupportFragmentManager().findFragmentByTag("HANDSTAND_FRAGMENT");

        if(checkHandStandFragment!=null && checkHandStandFragment.isVisible()){

        }else{
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.fragment_placeholder,new HandstandFragment(),"HANDSTAND_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
