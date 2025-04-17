import React from "react";
import {FirstReactComponent} from "./component/FirstReactComponent";
import * as ReactDOM from 'react-dom';
import './styles/SpecCourseStyles.css'
import {ReactComponentWithRestExample} from "./component/ReactComponentWithRestExample";

console.log('hello from js world!');

const ReactApp = () => {
    return (
        <div>
            FirstReactComponent:
            <FirstReactComponent />
            <hr />
            ReactComponentWithRestExample:
            <ReactComponentWithRestExample />
        </div>
    )
}

ReactDOM.render(<ReactApp />, document.getElementById('root'));