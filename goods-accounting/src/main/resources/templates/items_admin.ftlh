<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Items</title>
</head>
<body>
<div id="header">
    <h2>Items</h2>
</div>
<div id="content">
    <fieldset>
        <legend><h2>Add Item</h2></legend>
        <form action="/admin/item/add" enctype="multipart/form-data" method="post">
            <p><input type="file" name="file"><input type="submit" value="Upload"></p>
        </form>
    </fieldset>
    <br/>
    <table class="datatable">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Props</th>
        </tr>
        <#list items as item>
            <tr>
                <td>${item._id}</td>
                <td>${item.name}</td>
                <#list item.getProps()?keys as key>
                    <td>"${key} = ${item.getProps()[key]}"</td>
                </#list>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>
