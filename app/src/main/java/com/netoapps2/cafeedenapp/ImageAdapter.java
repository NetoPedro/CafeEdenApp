package com.netoapps2.cafeedenapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

class ImageAdapter extends BaseAdapter{
    private Context mContext;
    public ImageAdapter(Context c){
        mContext = c;
    }

    private String[] imagens = {
            //R.drawable.img_0216,

            "https://scontent-cdg2-1.xx.fbcdn.net/v/t1.0-9/13891982_697973790340692_5633332107192055551_n.jpg?oh=36f35195898e6e5340846141821803df&oe=584B1D0E",
            "https://scontent-cdg2-1.xx.fbcdn.net/v/t1.0-9/13920932_697968940341177_2330126349784775725_n.jpg?oh=0c0811c6ed3626cc23ff5140f6bd93a2&oe=58854837",
            "https://scontent-cdg2-1.xx.fbcdn.net/t31.0-8/13055671_653323654805706_7905961001936275550_o.jpg",
            "https://scontent-cdg2-1.xx.fbcdn.net/t31.0-8/13055915_653323631472375_2839488739512981964_o.jpg",
            "https://scontent-cdg2-1.xx.fbcdn.net/t31.0-8/13002526_653321481472590_101310484845746007_o.jpg",
            "https://scontent-cdg2-1.xx.fbcdn.net/t31.0-8/13041317_653321474805924_4290781193015611998_o.jpg",
            "https://scontent-cdg2-1.xx.fbcdn.net/t31.0-8/13064619_653321451472593_1603234613346657467_o.jpg",
            "https://scontent-cdg2-1.xx.fbcdn.net/t31.0-8/13064747_653321441472594_2119766193988157466_o.jpg",
            "https://scontent-cdg2-1.xx.fbcdn.net/t31.0-8/13029534_653321424805929_8662686578895997610_o.jpg",
            "https://scontent-cdg2-1.xx.fbcdn.net/t31.0-8/13041225_653321411472597_6818692163295352076_o.jpg",
            "https://scontent-cdg2-1.xx.fbcdn.net/t31.0-8/13055939_653321378139267_6028209400969487299_o.jpg",
            "https://scontent-cdg2-1.xx.fbcdn.net/t31.0-8/13064598_653321374805934_9044667507098926871_o.jpg",
            "https://scontent-cdg2-1.xx.fbcdn.net/v/t1.0-9/12647011_619454814859257_2831817263107283159_n.jpg?oh=48189be3cbc983265547c3919163f566&oe=5851D0EC",
            "https://scontent-cdg2-1.xx.fbcdn.net/t31.0-8/12628495_617682788369793_4447021375255658629_o.jpg",
            "https://scontent-cdg2-1.xx.fbcdn.net/t31.0-8/12658017_617681978369874_1295704260159044448_o.jpg",
            "https://scontent-cdg2-1.xx.fbcdn.net/t31.0-8/12615722_617681975036541_498711649595967142_o.jpg",
            "https://scontent-cdg2-1.xx.fbcdn.net/t31.0-8/12322502_595220173949388_439206926800960147_o.jpg"
    } ;

    @Override
    public int getCount() {
        return  imagens.length;
    }

    @Override
    public Object getItem(int i) {
        return imagens[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView;
        if(view == null){
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(300,300));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8,8,8,8);

        }
        else{
            imageView = (ImageView) view ;
        }
        //Picasso.with(mContext).load("https://scontent-cdg2-1.xx.fbcdn.net/t31.0-8/13064619_653321451472593_1603234613346657467_o.jpg").fit().into(imageView);
        //imageView.setImageResource(imagens[i]);
        //String url = myUrls.get(position);

        Glide.with(mContext)
                .load(imagens[i])
                .fitCenter()
                .placeholder(R.drawable.loading)
                .crossFade()
                .into(imageView);

        return imageView;

    }
}

