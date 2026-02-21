<body>
  <div>
    <h1>📖 Remove Last In Linked List ( Java )</h1>
    <h2>📑 Over View</h2>
    <p> This project demostrate how to remove the last node from a <b><mark>Singly Linked List in java </mark></b></p>
  </div>
  <div>
    <ul>
      <h3>📩 The implementation include :</h3>
    </ul>
    <ul>
      <li> Custom node class</li>
      <li>Head and Tail pointer managment</li>
      <li>size tracking</li>
      <li>Add Last operation (helper)</li>
      <li>Remove Last operation</li>
      <li>Print method for diplay the list</li>
    </ul>
  <p>➡️ This program helps in understanding pointer manipulation and traversal logic in linked List</p>
  </div>
  <div>
    <h2>🧠 Concept Used</h2>
    <ul>
      <h3>🧾 A <mark><b> Singly Linked List</b></mark> consists of :</h3>
    </ul>
    <ul>
      <li>Node (data + reference to the next node)</li>
      <li>Head pointer (first node)</li>
      <li>Tail pointer (last node)</li>
      <li>Size variable to track number of nodes</li>
    </ul>
    <h4>To remove the Last node </h4>
    <ol>
      <li>If the list is empty-> return error value </li>
      <li>If only one node exists -> set head and tail to null</li>
      <li>otherwise</li>
    </ol>
    <ul>
      <li> Traverse till the second last node</li>
      <li> Set its <mark><b> next</b></mark> to null</li>   
      <li> traverse tail yo second last node</li>
      <li>Decrease size</li>
    </ul>
  </div>
  <div>
    <h1> 🧾add Last method</h1>
  </div>
</body>

