package app.sonu.com.musicplayer.ui.main;

import android.support.v4.media.MediaBrowserCompat;

import java.util.List;

import app.sonu.com.musicplayer.base.ui.BaseMvpView;

/**
 * Created by sonu on 29/6/17.
 */

public interface MainMvpView extends BaseMvpView {
    void setSlidingUpPaneCollapsed();
    void setSlidingUpPaneExpanded();
    void setSlidingUpPaneHidden();
    boolean isSlidingUpPaneHidden();
    void hideMiniPlayer();
    void showMiniPlayer();
    void startAlbumFragment(MediaBrowserCompat.MediaItem item);
    void startArtistFragment(MediaBrowserCompat.MediaItem item);
    void displaySearchResults(List<MediaBrowserCompat.MediaItem> itemList);
    void displayToast(String message);
    void hideSearchView();
}
