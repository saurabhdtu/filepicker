package droidninja.filepicker.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public abstract class BaseFragment extends Fragment {

    public static final String FILE_TYPE="FILE_TYPE";
    public BaseFragment() {
        // Required empty public constructor
    }

    protected void fadeIn(View view)
    {
        Animation bottomUp = AnimationUtils.loadAnimation(getContext(),
                android.R.anim.fade_in);

        view.startAnimation(bottomUp);
        view.setVisibility(View.VISIBLE);
    }

    protected void fadeOut(View view)
    {
        Animation bottomUp = AnimationUtils.loadAnimation(getContext(),
                android.R.anim.fade_out);

        view.startAnimation(bottomUp);
        view.setVisibility(View.GONE);
    }
}
