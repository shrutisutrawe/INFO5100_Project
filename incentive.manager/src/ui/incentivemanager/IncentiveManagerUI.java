package ui.incentivemanager;

import javax.swing.*;
import java.awt.*;

public class IncentiveManagerUI extends JFrame {
    private JPanel mainPanel;
    private JTabbedPane tabbedPane;

    public IncentiveManagerUI() {
        this.setTitle("Create Incentive");

        // Create Main Panel
        mainPanel = new JPanel(new GridLayout());
        this.setContentPane(this.mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(1000, 400));
        this.pack();
        this.setVisible(true);

        // Create Tabbed Pane
        tabbedPane = new JTabbedPane();

        JComponent detailsPanel = new DetailsPanel();
        tabbedPane.addTab("Details", detailsPanel);

        JComponent inventoryPanel = new InventoryPanel();
        tabbedPane.addTab("Inventory", inventoryPanel);

        JComponent descriptionPanel = new DescriptionPanel();
        tabbedPane.addTab("Description", descriptionPanel);

        //Add the tabbed pane to this panel.
        mainPanel.add(tabbedPane);

        //The following line enables to use scrolling tabs.
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }

    public static void main(String[] args) {
        IncentiveManagerUI frame = new IncentiveManagerUI();
    }
}
