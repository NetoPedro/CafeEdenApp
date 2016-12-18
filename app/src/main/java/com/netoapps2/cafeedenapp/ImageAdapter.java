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

    private ImagemGaleria[] imagens = {
            new ImagemGaleria("https://scontent-cdg2-1.xx.fbcdn.net/v/t1.0-9/13891982_697973790340692_5633332107192055551_n.jpg?oh=36f35195898e6e5340846141821803df&oe=584B1D0E",ImagemGaleria.Categoria.COMIDA),
            new ImagemGaleria("https://scontent-cdg2-1.xx.fbcdn.net/v/t1.0-9/13920932_697968940341177_2330126349784775725_n.jpg?oh=0c0811c6ed3626cc23ff5140f6bd93a2&oe=58854837", ImagemGaleria.Categoria.DOCES),
            new ImagemGaleria("https://scontent-cdg2-1.xx.fbcdn.net/t31.0-8/13055671_653323654805706_7905961001936275550_o.jpg",ImagemGaleria.Categoria.COMIDA),
            new ImagemGaleria("https://scontent-cdg2-1.xx.fbcdn.net/t31.0-8/13055915_653323631472375_2839488739512981964_o.jpg", ImagemGaleria.Categoria.SALGADOS),
            new ImagemGaleria("https://scontent-cdg2-1.xx.fbcdn.net/t31.0-8/13002526_653321481472590_101310484845746007_o.jpg", ImagemGaleria.Categoria.DOCES),
            new ImagemGaleria("https://scontent-cdg2-1.xx.fbcdn.net/t31.0-8/13041317_653321474805924_4290781193015611998_o.jpg", ImagemGaleria.Categoria.DOCES),
            new ImagemGaleria("https://scontent-cdg2-1.xx.fbcdn.net/t31.0-8/13064619_653321451472593_1603234613346657467_o.jpg", ImagemGaleria.Categoria.DOCES),
            new ImagemGaleria("https://scontent-cdg2-1.xx.fbcdn.net/t31.0-8/13064747_653321441472594_2119766193988157466_o.jpg", ImagemGaleria.Categoria.DOCES),
            new ImagemGaleria("https://scontent-cdg2-1.xx.fbcdn.net/t31.0-8/13029534_653321424805929_8662686578895997610_o.jpg", ImagemGaleria.Categoria.DOCES),
            new ImagemGaleria("https://scontent-cdg2-1.xx.fbcdn.net/t31.0-8/13041225_653321411472597_6818692163295352076_o.jpg", ImagemGaleria.Categoria.DOCES),
            new ImagemGaleria("https://scontent-cdg2-1.xx.fbcdn.net/t31.0-8/13055939_653321378139267_6028209400969487299_o.jpg", ImagemGaleria.Categoria.DOCES),
            new ImagemGaleria("https://scontent-cdg2-1.xx.fbcdn.net/t31.0-8/13064598_653321374805934_9044667507098926871_o.jpg", ImagemGaleria.Categoria.DOCES),
            new ImagemGaleria("https://scontent-cdg2-1.xx.fbcdn.net/v/t1.0-9/12647011_619454814859257_2831817263107283159_n.jpg?oh=48189be3cbc983265547c3919163f566&oe=5851D0EC", ImagemGaleria.Categoria.COMIDA),
            new ImagemGaleria("https://scontent-cdg2-1.xx.fbcdn.net/t31.0-8/12628495_617682788369793_4447021375255658629_o.jpg", ImagemGaleria.Categoria.SALGADOS),
            new ImagemGaleria("https://scontent-cdg2-1.xx.fbcdn.net/t31.0-8/12658017_617681978369874_1295704260159044448_o.jpg", ImagemGaleria.Categoria.DOCES),
            new ImagemGaleria("https://scontent-cdg2-1.xx.fbcdn.net/t31.0-8/12615722_617681975036541_498711649595967142_o.jpg", ImagemGaleria.Categoria.DOCES),
            new ImagemGaleria("https://scontent-cdg2-1.xx.fbcdn.net/t31.0-8/12322502_595220173949388_439206926800960147_o.jpg", ImagemGaleria.Categoria.COMIDA),
            new ImagemGaleria("https://scontent-lhr3-1.xx.fbcdn.net/v/t31.0-8/12309779_595220050616067_7104003440538389870_o.jpg?oh=1bdc7427c18231fd75a7ae14ea8f9f04&oe=58B7D8EA", ImagemGaleria.Categoria.SALGADOS),
            new ImagemGaleria("https://scontent-lhr3-1.xx.fbcdn.net/v/t31.0-8/12307347_595219353949470_8081342696297149355_o.jpg?oh=922332af946f91781c90aecd17421e6e&oe=58E6139C", ImagemGaleria.Categoria.DOCES),
            new ImagemGaleria("https://scontent-lhr3-1.xx.fbcdn.net/v/t31.0-8/12273635_595219290616143_3432147245931388008_o.jpg?oh=dc8e200420384ca2de848486fdebd032&oe=58B114A6", ImagemGaleria.Categoria.DOCES),
            new ImagemGaleria("https://scontent-lhr3-1.xx.fbcdn.net/v/t31.0-8/12308176_595219287282810_193610236683245991_o.jpg?oh=b800b242dedad8b4ff8ee898b3d60400&oe=58AEC41E", ImagemGaleria.Categoria.DOCES),
            new ImagemGaleria("https://scontent-lhr3-1.xx.fbcdn.net/v/t31.0-8/12291883_595219283949477_6273613138010169891_o.jpg?oh=75544f50515b4ad6b25cc895ff2ba24e&oe=58B410EE", ImagemGaleria.Categoria.DOCES),
            new ImagemGaleria("https://scontent-lhr3-1.xx.fbcdn.net/v/t31.0-8/12314218_595218830616189_7271793333216984384_o.jpg?oh=fa53fd6f97b7cefd1ec298b2a0599d65&oe=58B535B0", ImagemGaleria.Categoria.DOCES),
            new ImagemGaleria("https://scontent-lhr3-1.xx.fbcdn.net/v/t31.0-8/12239211_595218813949524_5127005460307479664_o.jpg?oh=80cfcab95a6a101c023520b67e670218&oe=58F81CB2", ImagemGaleria.Categoria.DOCES),
            new ImagemGaleria("https://scontent-lhr3-1.xx.fbcdn.net/v/t31.0-8/12238246_595218773949528_3696806589265671077_o.jpg?oh=1e34ec11a0f56195a9c80fe53e8e69f5&oe=58B02C25", ImagemGaleria.Categoria.DOCES),
            new ImagemGaleria("https://scontent-lhr3-1.xx.fbcdn.net/v/t31.0-8/12273621_595218760616196_2237608365154620115_o.jpg?oh=4693194384eaa4c65eaf810084f0c902&oe=58F6BE48", ImagemGaleria.Categoria.DOCES),
            new ImagemGaleria("https://scontent-lhr3-1.xx.fbcdn.net/v/t31.0-8/12240195_589998354471570_1228903458506469620_o.jpg?oh=660cfc06d9a6a4793c486d23c1937427&oe=58BA37E4", ImagemGaleria.Categoria.COMIDA),
            new ImagemGaleria("https://scontent-lhr3-1.xx.fbcdn.net/v/t31.0-8/11707786_589998531138219_9103497159380429653_o.jpg?oh=d553e586267a686ebdf2ea1f2ac45dd8&oe=58F36E03", ImagemGaleria.Categoria.DOCES),
            new ImagemGaleria("https://scontent-lhr3-1.xx.fbcdn.net/v/t31.0-8/10480588_490201784451228_5505344308112182130_o.jpg?oh=7217e4262c6d6b84e878e23f940ab565&oe=58F99327", ImagemGaleria.Categoria.DOCES),
            new ImagemGaleria("https://scontent-lhr3-1.xx.fbcdn.net/v/t31.0-8/10620409_446693642135376_3045367953403175437_o.jpg?oh=3b5c316f0ff48c4dc3f230dbf93b1959&oe=58F6F4D5", ImagemGaleria.Categoria.COMIDA),
            new ImagemGaleria("https://scontent-lhr3-1.xx.fbcdn.net/v/t31.0-8/10959951_490201737784566_5593647635972460237_o.jpg?oh=cf40136625c0761804aa958a42e3781c&oe=58B95793", ImagemGaleria.Categoria.DOCES),
            new ImagemGaleria("https://scontent-lhr3-1.xx.fbcdn.net/v/t31.0-8/10457406_446693658802041_6998969287042776197_o.jpg?oh=54d13560fae3c014c7ff0c2fe01c36ef&oe=58B53D57", ImagemGaleria.Categoria.COMIDA),
            new ImagemGaleria("https://scontent-lhr3-1.xx.fbcdn.net/v/t31.0-8/1557145_490201587784581_2300277592388928036_o.jpg?oh=925dd2cba650c90451558215316339e7&oe=58AE7480", ImagemGaleria.Categoria.DOCES),
            new ImagemGaleria("https://scontent-lhr3-1.xx.fbcdn.net/v/t31.0-8/12240919_589998491138223_3355258966232834072_o.jpg?oh=0f8d0f82afba3dd0eab644577dfd5b6c&oe=58E7BD46", ImagemGaleria.Categoria.DOCES)

    } ;

    public void sortByCategory(){

        boolean ordenado;
        do {
            ordenado = true;
            for (int i = 0; i< imagens.length -1; i++){
                if(imagens[i].getCategoria() == ImagemGaleria.Categoria.DOCES){
                    if(imagens[i+1].getCategoria()!= ImagemGaleria.Categoria.DOCES){
                        switchImagens(i,i+1);
                        ordenado = false;
                    }
                }
                else if (imagens[i].getCategoria() == ImagemGaleria.Categoria.SALGADOS) {
                    if(imagens[i+1].getCategoria()== ImagemGaleria.Categoria.COMIDA){
                        switchImagens(i,i+1);
                        ordenado = false;
                    }
                }
            }

        }while (!ordenado);
    }

    private void switchImagens(int i , int j) {
        ImagemGaleria aux = null;
        aux =imagens[i];
        imagens[i] = imagens[j];
        imagens[j] = aux;
    }

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
            imageView.setLayoutParams(new GridView.LayoutParams(225,200));
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
                .load(imagens[i].getUrl())
                .fitCenter()
                .placeholder(R.drawable.loading)
                .crossFade()
                .into(imageView);

        return imageView;

    }
}

