import React, {useState} from 'react';

const FirstReactComponent = () => {
    const [value, setValue] = useState('')
    return (
        <div>
            <p>You entered: {value}</p>
            <input value={value} onChange={event => setValue(event.target.value)} />
        </div>
    )
}

export {FirstReactComponent};