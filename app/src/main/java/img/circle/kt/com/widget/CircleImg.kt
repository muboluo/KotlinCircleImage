package img.circle.kt.com.widget

import android.content.Context
import android.graphics.Color
import android.support.v7.widget.AppCompatImageView
import android.util.AttributeSet

/**
 * Created by henry on 2018/12/14.
 */
class CircleImg(context: Context, defStyleAttributes: AttributeSet, defAttrStyle: Int = 0) : AppCompatImageView(context,

        defStyleAttributes, defAttrStyle) {


    enum class ShapeType {

        SHAPE_CIRCLE,
        SHAPE_ROUND
    }

    private var shape_type: ShapeType = ShapeType.SHAPE_CIRCLE
        set(value) {
            field = value
            invalidate()
        }

    private var border_width: Float = 20f
        set(value) {
            field = value
            invalidate()
        }

    private var border_color: Int = Color.parseColor("#ff9900")
        set(value) {
            field = value
            invalidate()
        }

    private var left_top_radiusX: Float = 0f
        set(value) {
            field = value
            invalidate()
        }

    private var left_top_radiusY: Float = 0f
        set(value) {
            field = value
            invalidate()
        }

    private var right_top_radiusX: Float = 0f
        set(value) {
            field = value
            invalidate()
        }

    private var right_top_radiusY: Float = 0f
        set(value) {
            field = value
            invalidate()
        }

    private var right_bottom_radiusX: Float = 0f
        set(value) {

            field = value
            invalidate()

        }


}