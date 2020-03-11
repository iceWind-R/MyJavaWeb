<%@ page import="java.util.List" %>
<%@ page import="entity.Data" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>疫情柱形图</title>
  <meta charset="utf-8">
  <!-- 引入 ECharts 文件 -->
  <script src="js/echarts.min.js"></script>
</head>
<body>
<%! int i=0;%>
<div id="main" style="width: 600px;height:400px;"></div>
<script type="text/javascript">
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('main'));

    // 指定图表的配置项和数据
    var option = {
        title: {
            text: '疫情查询'
        },
        tooltip: {},
        legend: {

            data:['新增人数']
        },
        xAxis: {
             data:[ //["衬衫","羊毛衫","雪纺衫","裤子","高跟鞋","袜子"]
       <%
      List<Data> lists = (List<Data>) request.getAttribute("lists");
      //获取request域中的数据
      if(lists!=null){i=0;
        for(Data info:lists){
    %>
                "<%=info.getCityName()%>",
                <%
                      if(i++>20){
                %>
                 "<%=info.getCityName()%>"
                          <%
                          break;
                      }
                    }

                  }
                %>
                ]
        },
        yAxis: {},
        series: [{
            name: '销量',
            type: 'bar',
            data: [
                <%
               if(lists!=null){i=0;
                 for(Data info:lists){
             %>
                <%=info.getConfirmTotal()%>,
                <%
                      if(i++>20){
                 %>
                <%=info.getConfirmTotal()%>
                <%
                break;
            }
          }

        }
      %>
            ]
        }]
    };

    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);
</script>

<table border="1px" align="center">
  <tr>
    <th>城市</th>
    <th>确诊总数</th>
    <th>治愈率</th>
    <th>治愈人数</th>
    <th>死亡人数</th>
    <th>疑似人数</th>
    <th>死亡率</th>
    <th>今日确诊人数</th>
    <th>总确诊人数</th>
  </tr>
  <%

      for(Data info:lists){
  %>

  <tr>
    <td><%=info.getCityName() %></td>
    <td><%=info.getConfirmTotal() %></td>
    <td><%=info.getHealRate() %></td>
    <td><%=info.getHeal() %></td>
    <td><%=info.getDead() %></td>
    <td><%=info.getSuspect() %></td>
    <td><%=info.getDeadRate() %></td>
    <td><%=info.getConfirmToday() %></td>
    <td><%=info.getConfirmCuts() %></td>
  </tr>
  <%
    }
  %>
</table>
</body>
</html>
