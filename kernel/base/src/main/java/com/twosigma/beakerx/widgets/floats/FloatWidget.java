/*
 *  Copyright 2017 TWO SIGMA OPEN SOURCE, LLC
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.twosigma.beakerx.widgets.floats;

import com.twosigma.beakerx.widgets.styles.SliderStyle;
import java.io.Serializable;
import java.util.HashMap;

import com.twosigma.beakerx.widgets.ValueWidget;

public abstract class FloatWidget<T extends Serializable> extends ValueWidget<T> {

  protected SliderStyle style;

  protected FloatWidget() {
    super();
    style = new SliderStyle();
  }

  @Override
  protected HashMap<String, Serializable> content(HashMap<String, Serializable> content) {
    super.content(content);
    content.put(VALUE, this.value);
    return content;
  }

  @Override
  public T getValueFromObject(Object input) {
    return (T) getDouble(input);
  }

  @Override
  public SliderStyle getStyle() {
    return style;
  }

  public void setStyle(SliderStyle style) {
    this.style = style;
  }
}
