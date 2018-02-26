package com.wisdom.refreshview;

public abstract class RefreshListenerAdapter implements PullListener {
        @Override
        public void onPullingDown(XRefreshLayout refreshLayout, float fraction) {
        }

        @Override
        public void onPullingUp(XRefreshLayout refreshLayout, float fraction) {
        }

        @Override
        public void onPullDownReleasing(XRefreshLayout refreshLayout, float fraction) {
        }

        @Override
        public void onPullUpReleasing(XRefreshLayout refreshLayout, float fraction) {
        }

        @Override
        public void onRefresh(XRefreshLayout refreshLayout) {
        }

        @Override
        public void onLoadMore(XRefreshLayout refreshLayout) {
        }

        @Override
        public void onFinishRefresh() {

        }

        @Override
        public void onFinishLoadMore() {

        }

        @Override
        public void onRefreshCanceled() {

        }

        @Override
        public void onLoadmoreCanceled() {

        }
}