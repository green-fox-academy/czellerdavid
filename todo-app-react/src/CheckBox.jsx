import React from "react";

const CheckBox = props => (
  <div>
    <label className={props.value ? "s-label" : "s-defaultLabel"}>
      {props.title}
    </label>
    <input type="checkbox" {...props} />
  </div>
);

export default CheckBox;
