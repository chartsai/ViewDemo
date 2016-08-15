package idv.chatea.viewdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class ResultCircularView extends View {

    private final Paint p = new Paint();

    public ResultCircularView(Context context) {
        super(context);
    }

    public ResultCircularView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ResultCircularView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ResultCircularView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int min = widthMeasureSpec < heightMeasureSpec ?
                widthMeasureSpec : heightMeasureSpec;
        setMeasuredDimension(min, min);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int width = getWidth();

        p.setColor(Color.GREEN);

        canvas.drawCircle(canvas.getWidth() / 2, canvas.getWidth() / 2, width / 2, p);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();

        float cx = getWidth() / 2;
        float cy = getHeight() / 2;

        float r = getWidth() / 2;

        float diff = (x - cx) * (x - cx) + (y - cy) * (y - cy);
        if (diff < r * r) {
            if (event.getAction() == MotionEvent.ACTION_UP) {
                callOnClick();
            }
            return true;
        } else {
            return false;
        }
    }
}
