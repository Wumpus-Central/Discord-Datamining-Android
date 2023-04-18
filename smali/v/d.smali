.class public final synthetic Lv/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq/w$c;


# instance fields
.field public final synthetic a:Lv/g;


# direct methods
.method public synthetic constructor <init>(Lv/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv/d;->a:Lv/g;

    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 1

    iget-object v0, p0, Lv/d;->a:Lv/g;

    invoke-static {v0, p1}, Lv/g;->c(Lv/g;Landroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p1

    return p1
.end method
