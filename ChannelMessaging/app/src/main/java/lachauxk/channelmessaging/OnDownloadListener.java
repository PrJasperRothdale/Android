package lachauxk.channelmessaging;

import android.view.View;

/**
 * Created by lachauxk on 19/01/2018.
 */
public interface OnDownloadListener {

    public void OnDownloadComplete(String downloadedContent);

    public void onDownloadError(String downloadedContent);
}
