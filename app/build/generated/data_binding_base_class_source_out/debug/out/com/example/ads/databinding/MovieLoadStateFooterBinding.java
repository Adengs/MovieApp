// Generated by view binder compiler. Do not edit!
package com.example.ads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ads.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MovieLoadStateFooterBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnRetry;

  @NonNull
  public final ProgressBar progressbar;

  @NonNull
  public final TextView tvError;

  private MovieLoadStateFooterBinding(@NonNull LinearLayout rootView, @NonNull Button btnRetry,
      @NonNull ProgressBar progressbar, @NonNull TextView tvError) {
    this.rootView = rootView;
    this.btnRetry = btnRetry;
    this.progressbar = progressbar;
    this.tvError = tvError;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MovieLoadStateFooterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MovieLoadStateFooterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.movie_load_state_footer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MovieLoadStateFooterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_retry;
      Button btnRetry = ViewBindings.findChildViewById(rootView, id);
      if (btnRetry == null) {
        break missingId;
      }

      id = R.id.progressbar;
      ProgressBar progressbar = ViewBindings.findChildViewById(rootView, id);
      if (progressbar == null) {
        break missingId;
      }

      id = R.id.tv_error;
      TextView tvError = ViewBindings.findChildViewById(rootView, id);
      if (tvError == null) {
        break missingId;
      }

      return new MovieLoadStateFooterBinding((LinearLayout) rootView, btnRetry, progressbar,
          tvError);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
