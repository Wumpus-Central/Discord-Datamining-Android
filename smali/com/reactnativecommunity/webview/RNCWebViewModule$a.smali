.class Lcom/reactnativecommunity/webview/RNCWebViewModule$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/modules/core/PermissionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/reactnativecommunity/webview/RNCWebViewModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Lcom/reactnativecommunity/webview/RNCWebViewModule;


# direct methods
.method constructor <init>(Lcom/reactnativecommunity/webview/RNCWebViewModule;)V
    .locals 0

    iput-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebViewModule$a;->k:Lcom/reactnativecommunity/webview/RNCWebViewModule;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)Z
    .locals 1

    .line 1
    const/4 p2, 0x0

    .line 2
    const/4 v0, 0x1

    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    return p2

    .line 6
    :cond_0
    array-length p1, p3

    .line 7
    if-lez p1, :cond_1

    .line 8
    .line 9
    aget p1, p3, p2

    .line 10
    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    iget-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebViewModule$a;->k:Lcom/reactnativecommunity/webview/RNCWebViewModule;

    .line 14
    .line 15
    invoke-static {p1}, Lcom/reactnativecommunity/webview/RNCWebViewModule;->access$000(Lcom/reactnativecommunity/webview/RNCWebViewModule;)Landroid/app/DownloadManager$Request;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    iget-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebViewModule$a;->k:Lcom/reactnativecommunity/webview/RNCWebViewModule;

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/RNCWebViewModule;->downloadFile()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebViewModule$a;->k:Lcom/reactnativecommunity/webview/RNCWebViewModule;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/reactnativecommunity/webview/RNCWebViewModule;->access$100(Lcom/reactnativecommunity/webview/RNCWebViewModule;)Landroid/app/Activity;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const-string p2, "Cannot download files as permission was denied. Please provide permission to write to storage, in order to download files."

    .line 38
    .line 39
    invoke-static {p1, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 44
    .line 45
    .line 46
    :cond_2
    :goto_0
    return v0
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
.end method
