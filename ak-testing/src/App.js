
import './App.css';
import BaseComponent from './components/BaseComponent'
import withLogging from './components/withLogging'
const EnhancedComponent = withLogging(BaseComponent);
function App() {
  
  return (
    <div>
        <EnhancedComponent name="Anandh Raja Krishnamoorthy" />
    </div>
);
}

export default App;
