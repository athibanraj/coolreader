package cn.itcreator.android.reader.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.PaintDrawable;

import android.util.AttributeSet;
import android.view.View;

/**
 * 
 * Copyright mawei.81@gmail.com Blog: http://www.maweis.com
 * 
 * @author peter CustomTextView is a main View component for a reader which will
 *         be used to enjoy mobile read life
 * 
 */
public class CustomTextView extends View {

	// private String text;
	private String[] textArray;
	private int fontSize = 12;
	private int fontColor = Color.BLACK;
	private int lineHeight = 16;

	private int bgColor = Color.WHITE;

	private PaintDrawable paintDrawable;

	private Paint customPainter;

	private int alignTop = 70;
	private int alignLeft = 15;
	private int textHeight = 20;

	public CustomTextView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		initial();

	}

	public CustomTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
		initial();
	}

	public CustomTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		initial();
	}

	private void initial() {
		paintDrawable = new PaintDrawable(Color.WHITE);
		this.customPainter = paintDrawable.getPaint();
		this.customPainter.setColor(this.bgColor);

	}
	
	

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		// TODO Auto-generated method stub
		for (int i = 0; i < this.textArray.length; i++) {
			canvas.drawText(this.textArray[i], this.alignLeft,
					this.alignTop + this.textHeight * i, this.customPainter);
		}		
		paintDrawable.draw(canvas);
	}

	public void setTextColor(int colorIntValue) {
		// TODO Auto-generated method stub
		this.fontColor = colorIntValue;
	}

	public int getLineHeight() {
		// TODO Auto-generated method stub
		return this.lineHeight;

	}

	public Paint getPaint() {
		// TODO Auto-generated method stub
		return this.customPainter;
	}

	public void setTextSize(int fontSize) {
		// TODO Auto-generated method stub
		this.fontSize = fontSize;

	}

	public int getFontSize() {
		return fontSize;
	}

	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
	}

	public int getFontColor() {
		return fontColor;
	}

	public void setFontColor(int fontColor) {
		this.fontColor = fontColor;
	}

	public String[] getTextArray() {
		return textArray;
	}

	public void setTextArray(String[] textArray) {
		this.textArray = textArray;
		this.invalidate();
		this.postInvalidate();
	}

	public int getBgColor() {
		return bgColor;
	}

	public void setBgColor(int bgColor) {
		this.bgColor = bgColor;
	}

	public PaintDrawable getPaintDrawable() {
		return paintDrawable;
	}

	public void setPaintDrawable(PaintDrawable paintDrawable) {
		this.paintDrawable = paintDrawable;
	}

	public void setLineHeight(int lineHeight) {
		this.lineHeight = lineHeight;
	}

	public Paint getCustomPainter() {
		return customPainter;
	}

	public void setCustomPainter(Paint customPainter) {
		this.customPainter = customPainter;
	}

	public int getAlignTop() {
		return alignTop;
	}

	public void setAlignTop(int alignTop) {
		this.alignTop = alignTop;
	}

	public int getAlignLeft() {
		return alignLeft;
	}

	public void setAlignLeft(int alignLeft) {
		this.alignLeft = alignLeft;
	}

	public int getTextHeight() {
		return textHeight;
	}

	public void setTextHeight(int textHeight) {
		this.textHeight = textHeight;
	}

}
