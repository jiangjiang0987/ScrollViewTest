//package com.example.administrator.scrollviewtest;
//
//import android.content.Context;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//
//import java.util.ArrayList;
//
///**
// * Created by Administrator on 2016/12/15.
// */
//public class ImgListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
//    private ArrayList<ImageInfo> mDatas = new ArrayList<ImageInfo>();
//    private Context mCOntext;
//    private View mView;
//    private OnFooterViewClickListener onFooterViewClickListener;
//
//    public ImgListAdapter(ArrayList<ImageInfo> mDatas, Context mCOntext) {
//        this.mDatas = mDatas;
//        this.mCOntext = mCOntext;
//    }
//
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        if(viewType == 1){
//            mView = LayoutInflater.from(mCOntext).inflate(R.layout.Compose_idea_img_item,parent,false);
//
//        }
//    }
//    protected class ImgViewHolder extends RecyclerView.ViewHolder{
//        public ImageView imageView;
//        public ImageView deleteImg;
//        public ImgViewHolder(View view){
//            super(view);
//            imageView = (ImageView)view.findViewById(R.id.imageitem);
//            deleteImg = (ImageView)view.findViewById(R.id.deleteitem);
//        }
//    }
//
//    @Override
//    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
//        if(holder instanceof  ImgViewHolder){
//            ImageLoad
//        }
//    }
//
//    @Override
//    public int getItemCount() {
//        if (mDatas != null && mDatas.size() > 0){
//            return mDatas.size() + 1;
//        }else {
//            return  0;
//        }
//    }
//
//    @Override
//    public int getItemViewType(int position) {
//        if(mDatas.size() > 0 && position == mDatas.size()){
//            return 2;
//        }
//        else {
//            return 1;
//        }
//    }
//
//    public void setmDatas(ArrayList<ImageInfo> mDatas) {
//        this.mDatas = mDatas;
//    }
//
//    protected class FootViewHoder extends RecyclerView.ViewHolder{
//        public ImageView addpic;
//
//        public FootViewHoder(View itemView) {
//            super(itemView);
//            addpic = (ImageView)itemView.findViewById(R.id.addpic);
//        }
//    }
//    public interface OnFooterViewClickListener{
//        public void OnFooterViewClick();
//    }
//    public void setOnFooterViewClickListener(OnFooterViewClickListener onFooterViewClickListener){
//        this.onFooterViewClickListener = onFooterViewClickListener;
//    }
//}
