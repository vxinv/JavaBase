import uiautomation as auto
import time
ths = auto.WindowControl(Name='网上股票交易系统5.0')
buy = ths.TreeItemControl(Name='买入[F1]')
buy.Click()
input_list = auto.PaneControl(ClassName='AfxMDIFrame42s',AutomationId=59648)
re_input = auto.ButtonControl(Name='重填')
time.sleep(1)
# 为了避免错误 清空之前所有的输入
re_input.Click()
# 输入证券代码
auto.SendKeys("000001")
# 清空价格  不清楚py的for循环
for i in range(5):
    auto.SendKeys('{BACK}',0)
# 输入价格
auto.SendKeys("10.00")
# 向下键 数量
auto.SendKeys('{DOWN}')
auto.SendKeys("100")
# 按下成交
auto.SendKeys('{ENTER}')
# 不获取提示框
auto.SendKeys('{ENTER}')
auto.SendKeys('{ENTER}')

